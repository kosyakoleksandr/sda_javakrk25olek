package pl.sda.javakrk25.day5;

import java.util.Random;
import java.util.Scanner;

public class Zad_9_game_too_much_not_enough {

    /**
     * Program losuję liczbę 1-20,
     * użytkownik wpisuje liczbę,
     * program odpowiada: ZA MAłO, ZA DUZO, WYGRAłEś
     *
     * @param args
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int wylosowanaLiczba = r.nextInt(19) + 1;
        int wprowadzonaLiczba = 0;

        do {
            System.out.println("Wprowadz liczbę od 1 do 20");
            wprowadzonaLiczba = scanner.nextInt();
            if (wylosowanaLiczba < wprowadzonaLiczba) {
                System.out.println("ZA DUŻA");
            } else if (wylosowanaLiczba > wprowadzonaLiczba) {
                System.out.println("ZA MAŁA");
            } else {
                System.out.println("WYGRAŁEŚ");
            }
        } while (wprowadzonaLiczba != wylosowanaLiczba);
    }

}
