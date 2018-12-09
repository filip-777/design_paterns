package pl.sda.behavioral.strategy_and_mediator;

public class Robot {
    private Position currentPosition;

    public void updatePosition(Position position) {
        currentPosition = position;
    }
}
