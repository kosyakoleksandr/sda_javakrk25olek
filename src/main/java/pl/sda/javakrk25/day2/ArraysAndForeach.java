package pl.sda.javakrk25.day2;


import java.util.Random;

public class ArraysAndForeach {

    public static void main(String[] args) {
        Random r = new Random();
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = r.nextInt(100);
        }

        int suma = 0;
        int max = 0;
        System.out.println("Zawartość tablicy:");
        for (int element : tablica) {
            System.out.println(element);
            suma += element;
            if (element > max) {
                max = element;
            }
        }

        float srednia = suma / (float) tablica.length;
        System.out.println("Suma elementów: " + suma);
        System.out.println("średnia elementów: " + srednia);
        System.out.println("Największa liczba: " + max);

    }
}
