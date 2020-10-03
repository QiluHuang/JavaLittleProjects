package exercise1;

public class Person {
    String name;
    int age;
    int id = 1001;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void eat() {
        System.out.println("Person is eating.");
    }

    public void walk() {
        System.out.println("Person is walking.");
    }
}
