package com.boeing.application;

import com.boeing.application.fibonacci.FibonacciCalculator;
import com.boeing.application.fibonacci.FibonacciFactory;

public class Main {
    public static void main(String args[]) {
        FibonacciCalculator calculator = new FibonacciFactory().create();

        System.out.println("fibonacci(0) = " + calculator.calculate(0));
        System.out.println("fibonacci(1) = " + calculator.calculate(1));
        System.out.println("fibonacci(2) = " + calculator.calculate(2));
        System.out.println("fibonacci(3) = " + calculator.calculate(3));
        System.out.println("fibonacci(10) = " + calculator.calculate(10));
        System.out.println("fibonacci(20) = " + calculator.calculate(20));
        System.out.println("fibonacci(45) = " + calculator.calculate(45)); // a little bit too long
        System.out.println("fibonacci(50) = " + calculator.calculate(50)); // too long
    }
}
