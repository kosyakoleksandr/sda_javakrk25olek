package pl.sda.javakrk25.day1;

import java.util.Scanner;

public class HomeworkCalculator {

    public static void main(String[] args) {
        float a, b;
        char operation;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        b = scanner.nextInt();
        System.out.println("Podaj operację:");
        operation = scanner.next().charAt(0);

        float result;

        switch (operation) {
            case '+': {
                result = a + b;
                break;
            }
            case '-': {
                result = a - b;
                break;
            }
            case '*': {
                result = a * b;
                break;
            }
            case '/': {
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("ZERO division not supported");
                    return;
                }
                break;
            }
            default: {
                System.out.println("Unknown operation: " + operation);
                return;
            }
        }

        System.out.println(String.format("%.1f %c %.1f = %.2f", a, operation, b, result));
    }

}
