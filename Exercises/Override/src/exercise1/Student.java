package exercise1;

public class Student extends Person{
    String major;
    int id = 1002;

    public Student() {}

    public Student(String major) {
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("Student is eating more food.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }

    public void show() {
        System.out.println("name: " + this.name + " , age : " + super.age);
        System.out.println("id1: " + this.id);
        System.out.println("id2: " + super.id);
    }
}
