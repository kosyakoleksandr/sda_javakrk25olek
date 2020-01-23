package pl.sda.javakrk25.day2;

import java.util.Scanner;

public class DoWhileWithInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Czy chcesz opuścić program?");
            answer = scanner.nextLine();
        } while (!answer.equals("tak"));
    }
}
