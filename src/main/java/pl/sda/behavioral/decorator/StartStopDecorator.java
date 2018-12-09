package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class StartStopDecorator extends Calculator {

    private final Calculator calculator;

    public StartStopDecorator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        SingletonLogger.getInstance().log(String.format("Start"));
        int result = calculator.add(a,b);
        SingletonLogger.getInstance().log(String.format("Stop"));
        return result;
    }
}
