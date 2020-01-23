package pl.sda.javakrk25.day2;

public class StringArrays {
    public static void main(String[] args) {

        String[] imiona = {"Janek", "Ala", "Marysia", "Krzysiek", "Jacek"};
        String polaczoneImiona = "";

        for (String imie : imiona) {
            polaczoneImiona += imie + ", ";
        }

        System.out.println(polaczoneImiona);

    }
}
