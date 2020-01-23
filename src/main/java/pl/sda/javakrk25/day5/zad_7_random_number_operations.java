package pl.sda.javakrk25.day5;

import java.util.Random;

public class zad_7_random_number_operations {
    public static final int NUMBERS_COUNT = 1000;

    /**
     * Program losuje 1000 licz z zakrasu -100 do 100
     * Oblicza ich sumę, średnią, max, min
     * wyznacza, ile liczb jest większych od średniej, większych od zera
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = new int[NUMBERS_COUNT];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < NUMBERS_COUNT; i++) {
            numbers[i] = random.nextInt(200) - 100;
            sum += numbers[i];
        }
        float avg = sum / (float) NUMBERS_COUNT;

        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + avg);

        System.out.println("Bigger than avg: " + countNumberBiggerThan(numbers, avg));
        System.out.println("Bigger than zero: " + countNumberBiggerThan(numbers, 0));
    }

    static int countNumberBiggerThan(int[] numbers, float limit) {
        int counter = 0;
        for (int i : numbers) {
            if (i > limit) counter++;
        }
        return counter;
    }
}
