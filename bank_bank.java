abstract class Bank_Account {
    private double balance;

    public Bank_Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayBalance();

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Bank_Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Savings Account Balance: " + getBalance());
    }
}

class CurrentAccount extends Bank_Account {
    private double overdraftLimit = 500;

    public CurrentAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Account Balance: " + getBalance());
    }
}

public class bank_bank {
    public static void main(String[] args) {

        Bank_Account sa1 = new SavingsAccount(2000);
        sa1.deposit(500);
        sa1.withdraw(1000);
        sa1.displayBalance();
        

    }
}