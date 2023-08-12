package dz.manyTasks.inheritance.task5;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getbalance() {
        return balance;
    }
}
