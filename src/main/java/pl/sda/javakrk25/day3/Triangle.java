package pl.sda.javakrk25.day3;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double area() {
        return 0.5 * a * h;
    }

    public double perimeter() {
        return a + b + c;
    }
}
