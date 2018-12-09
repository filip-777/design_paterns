package pl.sda.behavioral.command;

public interface BankCommand extends Command {
    void execute();
    void undo();
}
