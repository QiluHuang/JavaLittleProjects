package exercise3;

public class Circle {
    private double radius;
    final double pi = 3.14;

    // constructor
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // method
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double findArea() {
//        return pi * radius * radius;
        return Math.PI * radius * radius;
    }
}
