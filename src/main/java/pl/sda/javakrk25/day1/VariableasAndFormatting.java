package pl.sda.javakrk25.day1;

import java.util.Scanner;

public class VariableasAndFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //deklaracja zmiennych
        String name;
        int age;
        float pi = 3.14128f;

        //pobranie danych
        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("How old are you?");
        age = scanner.nextInt();

        System.out.println("Hello " + name + "!");
        System.out.println("Pi: " + pi);

        System.out.printf("Hello %s! \n", name);
        System.out.printf("Pi: %.4f \n", pi);
        System.out.printf("Age: %d \n", age);

        String text = String.format("Hello %s, age: %d and PI is: %.2f", name, age, pi);
        System.out.println(text);


    }
}
