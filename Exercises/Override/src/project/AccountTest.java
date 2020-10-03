package project;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(300000);
        account.withdraw(3000);
        System.out.println("After the first withdrawal, The account balance is " + account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("After the second withdrawal and the deposit, the account balance is " + account.getBalance());

        System.out.println("Your monthly interest: " + (account.getMonthlyInterest() * 100) + "%");
    }
}
