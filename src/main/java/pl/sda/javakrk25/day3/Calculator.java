package pl.sda.javakrk25.day3;

import java.util.Scanner;

public class Calculator {

    static final String SYMBOL_ADD = "+";
    static final String SYMBOL_SUBSTRACT = "-";
    static final String SYMBOL_MULTIPLY = "*";
    static final String SYMBOL_DIVIDE = "/";
    static final String SYMBOL_MODULO = "%";

    public static double add(int a, int b) {
        return a + b;
    }

    public static double substract(int a, int b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("ZERO DIVISION!");
            return 0;
        }
        return a / (double) b;
    }

    public static double modulo(int a, int b) {
        return a % b;
    }

    public static double calculate(int a, int b, String operacja) {
        switch (operacja) {
            case SYMBOL_ADD: {
                return Calculator.add(a, b);
            }
            case SYMBOL_SUBSTRACT: {
                return Calculator.substract(a, b);
            }
            case SYMBOL_MULTIPLY: {
                return Calculator.multiply(a, b);
            }
            case SYMBOL_DIVIDE: {
                return Calculator.divide(a, b);
            }
            case SYMBOL_MODULO: {
                return Calculator.modulo(a, b);
            }
            default: {
                System.out.println("Nieznana operacja: " + operacja);
                return 0;
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("Podaj operację do wykonania");
        String operacja = scanner.next();

        double wynik = Calculator.calculate(a, b, operacja);

        System.out.println(String.format("Wynik: %.2f", wynik));
    }
}
