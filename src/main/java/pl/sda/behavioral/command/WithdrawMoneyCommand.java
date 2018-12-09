package pl.sda.behavioral.command;

public class WithdrawMoneyCommand implements BankCommand {

    private final BankAccount bankAccount;
    private final int moneyToWithdraw;

    public WithdrawMoneyCommand(BankAccount bankAccount, int moneyToWithdraw) {
        this.bankAccount = bankAccount;
        this.moneyToWithdraw = moneyToWithdraw;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(moneyToWithdraw);
    }

    @Override
    public void undo() {
        bankAccount.deposit(moneyToWithdraw);
    }
}
