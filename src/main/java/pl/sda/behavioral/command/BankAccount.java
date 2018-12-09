package pl.sda.behavioral.command;

public class BankAccount {
    private int balance = 0;

    public void deposit(int moneyToDeposit) {
        if(moneyToDeposit > 0) {
            balance += moneyToDeposit;
        }
    }

    public void withdraw(int moneyToWithdraw) {
        if(moneyToWithdraw > 0) {
            balance -= moneyToWithdraw;
        }
    }

    public int getBalance() {
        return balance;
    }
}
