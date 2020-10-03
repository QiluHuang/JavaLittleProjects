package project;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    // constructor
    public Account() {}

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // getter & setter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() { return this.balance; }

    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public double getAnnualInterestRate() { return this.annualInterestRate; }

    // methods
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return;
        }

        System.out.println("Insufficient balance!\nYour account balance is " + this.balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
