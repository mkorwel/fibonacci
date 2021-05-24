package com.boeing.application.fibonacci;

public class FibonacciCalculator {
    private final FibonacciInputValidator validator;

    FibonacciCalculator(FibonacciInputValidator validator) {
        this.validator = validator;
    }

    public long calculate(int number) {
        if (!validator.validate(number)) {
            throw new IllegalArgumentException("Invalid input data.");
        }
        return fibonacci(number);
    }

    private long fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
