package pl.sda.javakrk25.day5;

import java.util.Random;

public class Zad_14_histogram {
    /**
     * stworymy program ktory
     * stworz program krory
     * @param args
     */

    /**Stworz progrom ktory*/
    /**
     * Stworzymy pogram ktory
     */

    public static void main(String[] args) {
        int[] histogram = new int[10];
        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            int randomNumber = random.nextInt(10);
            histogram[randomNumber]++;
        }

        for (int i = 0; i < histogram.length; i++) {
            System.out.println(String.format("%d -> %d", i, histogram[i]));
        }
        // some more info
    }
}
