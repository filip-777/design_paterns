package pl.sda.behavioral.decorator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Denominator cannot have the value of 0!");
        }
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
