package pl.sda.javakrk25.day2;

import java.util.Scanner;

public class SummaryExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] towary = {"jaja", "mleko", "kawa"};

//        System.out.println("Jak masz na imię?");
//        String imie = scanner.next();

        String imie = args[0];

        System.out.println("Cześć " + imie + ", mamy w ofercie:");
        for (String t : towary) {
            System.out.println(t);
        }

        String koszyk = "";
        String wybor = "";
        do {
            System.out.println("Co chciałbyś kupić? Wpisz 'koniec' aby zakończyć.");
            wybor = scanner.next();
            switch (wybor) {
                case "jaja": {
                    System.out.println("Ok, dodajemy jaja do koszyka");
                    koszyk += wybor + ", ";
                    break;
                }
                case "mleko": {
                    System.out.println("Ok, dodajemy mleko do koszyka");
                    koszyk += wybor + ", ";
                    break;
                }
                case "kawa": {
                    System.out.println("Ok, dodajemy kawa do koszyka");
                    koszyk += wybor + ", ";
                    break;
                }
                case "koniec": {
                    break;
                }
                default: {
                    System.out.println("Przykro nam, nie posiadamy " + wybor);
                    break;
                }
            }
        } while (!wybor.equals("koniec"));

        System.out.println("Twoje zakupy:" + koszyk);
    }

}
