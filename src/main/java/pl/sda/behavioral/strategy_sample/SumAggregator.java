package pl.sda.behavioral.strategy_sample;

public class SumAggregator implements Aggregator{

    @Override
    public int execute(int current, int number) {

        return current + number;
    }
}
