package pl.sda.javakrk25.day2;

import java.util.Scanner;

public class WhileWithTime {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis(); // pobieramy czas na początku programu
        int number = 0;

        while ((System.currentTimeMillis() - startTime) < 10_000) {
            System.out.println("Podaj liczbe");
            number += scanner.nextInt();
        }
        System.out.println("Suma:" + number);

    }

}
