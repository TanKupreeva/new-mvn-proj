package dz.manyTasks.inheritance.task5;

public class Test {
    public static void main(String[] args) {
        BankAccount BA1234 = new BankAccount("BA1234", 500);
        System.out.println("Balance " + BA1234.getAccountNumber() + " is: " + BA1234.getbalance());
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $ " + BA1234.getbalance());
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $ " + BA1234.getbalance());
        SavingAccounts SA1000 = new SavingAccounts("SA1000", 450);
        System.out.println("Balance " + SA1000.getAccountNumber() + " is " + SA1000.getbalance());
        SA1000.withdraw(300);
        System.out.println("New balance after withdrawing $300: $ " + SA1000.getbalance());
        SA1000.withdraw(250);
        System.out.println("New balance after trying to withdraw $250: $ " + SA1000.getbalance());


    }
}
