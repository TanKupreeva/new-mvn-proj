package dz.manyTasks.abstract_classes.task3;

import dz.question.q7.B;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class BankAccaunt {
    private String accountNumber;
    private double balance;

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingAccaunt extends BankAccaunt {


    public SavingAccaunt(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $ " + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        }
    }
}


class CurrentAccaunt extends BankAccaunt {

    public CurrentAccaunt(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $ " + amount + " successful. Current balance:" + getBalance());
    }

    @Override
    void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        }
    }
}
class Test {
    public static void main(String[] args) {
       SavingAccaunt savingAccaunt = new SavingAccaunt("QWE",700);
       savingAccaunt.deposit(900);
       savingAccaunt.withdraw(1000);
       CurrentAccaunt currentAccaunt = new CurrentAccaunt("POI",900);
       currentAccaunt.withdraw(70000);
       currentAccaunt.deposit(90);
    }
}