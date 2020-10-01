package exercise3;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(2.1);
        cylinder.setHigh(3.4);
        double volume = cylinder.findVolume();
        System.out.println("The volume of Cylinder is " + volume);

        double area = cylinder.findArea();
        System.out.println("The area of its bottom is " + area);
    }
}
