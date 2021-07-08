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
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
