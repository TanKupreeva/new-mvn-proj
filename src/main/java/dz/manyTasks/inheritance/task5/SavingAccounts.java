package dz.manyTasks.inheritance.task5;

public class SavingAccounts extends BankAccount {

    public SavingAccounts(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getbalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
}
