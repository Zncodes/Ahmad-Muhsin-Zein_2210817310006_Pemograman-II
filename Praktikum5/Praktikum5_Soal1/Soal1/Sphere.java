package Soal1;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}