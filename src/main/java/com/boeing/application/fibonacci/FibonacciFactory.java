package com.boeing.application.fibonacci;

public class FibonacciFactory {
    public FibonacciCalculator create() {
        return new FibonacciCalculator(new FibonacciInputValidator());
    }
}
