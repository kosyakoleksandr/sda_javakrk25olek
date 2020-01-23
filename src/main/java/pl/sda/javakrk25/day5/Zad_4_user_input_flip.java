package pl.sda.javakrk25.day5;

import java.util.Scanner;

public class Zad_4_user_input_flip {
    static final int NUMBERS_COUNTS = 3;

    /**
     * Pobraż od użytkownika N liczn, zapisać do tablicy.
     * Odwrócić kolejność tych liczb w tablicy
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[NUMBERS_COUNTS];
        for (int i = NUMBERS_COUNTS - 1; i >= 0; i--) {
            System.out.println("Podaj liczbę: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Podane liczby to: ");
        int sum = 0;
        for (int i : numbers) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Suma liczb " + sum);
    }
}
