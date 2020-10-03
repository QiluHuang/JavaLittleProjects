package project;

public class CheckingAccount extends Account {
    private double overdraft;

    // constructor
    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    // getter & setter
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return this.overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            // 1
//            setBalance(getBalance() - amount);
            // 2
            super.withdraw(amount);

        } else if(overdraft >= (amount - getBalance())) {
            overdraft -= (amount - getBalance());
            // 1
//            setBalance(0);
            // 2
            super.withdraw(getBalance());

        } else {
            System.out.println("It's out of overdraft limit.");
        }
    }
}
