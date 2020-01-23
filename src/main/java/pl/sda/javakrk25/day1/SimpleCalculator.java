package pl.sda.javakrk25.day1;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;

        System.out.println("Provide numbers to calculate:");
        a = scanner.nextFloat();
        b = scanner.nextFloat();


        double sum = a + b;
        double multiply = a * b;
        System.out.println(String.format("Sum: %.2f", sum));
        System.out.println(String.format("Multiply: %.2f", multiply));
    }
}
