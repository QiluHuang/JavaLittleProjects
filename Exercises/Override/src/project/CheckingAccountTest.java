package project;

public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1122,20000,0.045,5000);

        account.withdraw(5000);
        System.out.println("You account balance is: " + account.getBalance());
        System.out.println("You overdraft is " + account.getOverdraft());

        System.out.println("--------------------------------------");
        account.withdraw(18000);
        System.out.println("You account balance is: " + account.getBalance());
        System.out.println("You overdraft is " + account.getOverdraft());

        System.out.println("--------------------------------------");
        account.withdraw(3000);
        System.out.println("You account balance is: " + account.getBalance());
        System.out.println("You overdraft is " + account.getOverdraft());
    }
}
