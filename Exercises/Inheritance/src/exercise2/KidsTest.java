package exercise2;

public class KidsTest {
    public static void main (String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(0);
        someKid.setSalary(3000);
        someKid.setAge(5);
        someKid.printAge();
        someKid.manOrWoman();
        someKid.isEmployed();
    }
}
