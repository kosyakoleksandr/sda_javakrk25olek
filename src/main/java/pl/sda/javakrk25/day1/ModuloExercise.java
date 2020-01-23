package pl.sda.javakrk25.day1;

import java.util.Scanner;

public class ModuloExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

}
