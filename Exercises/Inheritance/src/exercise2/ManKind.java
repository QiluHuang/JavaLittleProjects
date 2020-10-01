package exercise2;

import org.w3c.dom.ls.LSOutput;

public class ManKind {
    private int sex;
    private int salary;

    // constructor
    public ManKind() {}

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    // method
    public void setSex(int sex) {
        if (sex < 0 || sex > 1) {
            System.out.println("Fail to set");
        } else {
            this.sex = sex;
        }
    }

    public int getSex() {
        return this.sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void manOrWoman() {
//        if (sex == 1) {
//            System.out.println("man");
//        } else if (sex == 0) {
//            System.out.println("woman");
//        } else {
//            System.out.println("It's a secret.");
//        }

        String sexInfo = sex == 0 ? "woman" : "man";
        System.out.println("This is " + sexInfo);
    }

    public void isEmployed() {
//        if (salary == 0) {
//            System.out.println("No job");
//        } else {
//            System.out.println("job");
//        }

        String jobInfo = salary == 0 ? "no job" : "job";
        System.out.println(jobInfo);
    }
}
