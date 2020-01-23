package pl.sda.javakrk25.day2;

import java.util.Scanner;

public class ForLoopShoppingBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;

        for (int i = 0; i < 3; i++) {
            System.out.println("Add item: ");
            item = scanner.next();
            System.out.println("Added " + item + " to the list");
        }
    }

}
