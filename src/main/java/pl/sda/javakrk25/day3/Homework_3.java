package pl.sda.javakrk25.day3;

public class Homework_3 {

    /**
     * Stwórz klasę Rectangle, która będzie miała pola: a, b (długości boków).
     * Do klasy dodaj konstruktor (ustawiający wartości wszystkich pól).
     * <p>
     * Dodaj do klasy metodę getArea, która zwróci pole powierzchni,
     * oraz metodę getPerimeter zwracającą obwód figury.
     * <p>
     * Postąp analogicznie dla koła oraz trójkątu (a, b, c).
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.5, 4.2);
        System.out.println("Pole powierzchni prostokąta = " + rectangle.area());
        System.out.println("Obwód prostokąta = " + rectangle.perimeter());

        Circle circle = new Circle(5);
        System.out.println("Pole koła wynosi: " + circle.area());
        System.out.println("Obwód koła: " + circle.perimeter());

        Triangle triangle = new Triangle(3, 4, 5.2, 4);
        System.out.println(String.format("Pole trójkąta wynosi %.2f", triangle.area()));
        System.out.println(String.format("Obwód trójkąta wynosi %.2f", triangle.perimeter()));
    }

}
