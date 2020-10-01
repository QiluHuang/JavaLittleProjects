package exercise2;

public class Kids extends ManKind {
    private int age;

    // constructor
    public Kids() {}

    public Kids(int age) {
        this.age = age;
    }

    // method
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("fail to set");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void printAge() {
        System.out.println("I am " + age + " years old now!");
    }
}
