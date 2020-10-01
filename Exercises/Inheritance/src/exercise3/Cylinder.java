package exercise3;

public class Cylinder extends Circle {
    private double high;

    // constructor
    public Cylinder() {
        this.high = 1.0;
    }

    public Cylinder(double high) {
        this.high = high;
    }

    // methods
    public void setHigh(double high) {
        if (high > 0) {
            this.high = high;
        }
    }

    public double getHigh() {
        return this.high;
    }

    public double findVolume() {
        return findArea() * getHigh();
    }
}
