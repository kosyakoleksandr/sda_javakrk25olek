package pl.sda.javakrk25.day5;

import java.util.Random;

public class Zad_8_random_matrix {
    static int MATRIX_SIZE = 5;

    /**
     * Tablicę 5x5 zapełnić osowymi wartościami
     * Dla każdegej kolumny policzyć średnią i sumę
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numbers = new int[MATRIX_SIZE][MATRIX_SIZE];
        int sum = 0;
        //zapełnienie tablicy losowymi wartościami
        for (int i = 0; i < MATRIX_SIZE; i++) { //przejście po kolumnach: i
            for (int j = 0; j < MATRIX_SIZE; j++) {// przejście po wierszach: j
                numbers[i][j] = random.nextInt(100);
                sum += numbers[i][j];
            }
        }

        for (int i = 0; i < MATRIX_SIZE; i++) {
            printDetailsForColumn(numbers, i);
        }

    }

    static void printDetailsForColumn(int[][] numbers, int col) {
        System.out.println("Details for column: " + col);
        int[] column = numbers[col];

        int sum = 0;
        for (int i : column) sum += i;

        float avg = sum / (float) column.length;
        System.out.println("Sum:" + sum);
        System.out.println("Avg:" + avg);
    }

}
