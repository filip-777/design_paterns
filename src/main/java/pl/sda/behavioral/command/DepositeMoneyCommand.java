package pl.sda.behavioral.command;

public class DepositeMoneyCommand implements BankCommand {

    private final BankAccount bankAccount;
    private final int moneyToDeposit;

    public DepositeMoneyCommand(BankAccount bankAccount, int moneyToDeposit) {
        this.bankAccount = bankAccount;
        this.moneyToDeposit = moneyToDeposit;
    }


    @Override
    public void execute() {
        bankAccount.deposit(moneyToDeposit);
    }

    @Override
    public void undo() {
        bankAccount.withdraw(moneyToDeposit);
    }
}
