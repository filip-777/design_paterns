package pl.sda.behavioral.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(3,5);

        calculator = new LoggingDecorator(calculator);
        calculator.add(4,5);

        calculator = new StartStopDecorator(calculator);
        calculator.add(20,25);


    }
}
