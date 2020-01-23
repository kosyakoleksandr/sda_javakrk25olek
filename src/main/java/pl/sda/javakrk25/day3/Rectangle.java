package pl.sda.javakrk25.day3;

public class Rectangle {
    // definiowanie pól z modyfikatorem dostępu private
    private double a;
    private double b;

    // konstruktor, który przyjmuje i inicjalizuje oba pola będące długościami boków prostokąta
    public Rectangle(double a, double b) {
        // this.a odnosi się do pola klasy, a samo a do parametru przekazanego w konstruktorze klasy
        this.a = a;
        this.b = b;
    }

    // public ze względu na używanie metody poza klasą
    public double area() {
        return this.a * this.b;
    }

    public double perimeter() {
        return 2 * this.a + 2 * this.b;
    }
}
