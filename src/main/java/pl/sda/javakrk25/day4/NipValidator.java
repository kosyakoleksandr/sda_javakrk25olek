package pl.sda.javakrk25.day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NipValidator {

    public static void main(String[] args) {
        //przykładowy NIP: 123-456-32-18
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj NIP:");
        String nip = scanner.next();
        String simpleNip = nip.replace("-", "");

        Pattern nipPattern = Pattern.compile("[0-9]{10}");
        Matcher nipMatcher = nipPattern.matcher(simpleNip);

        if (nipMatcher.matches()) {
            System.out.println("NIP poprawny");
        } else {
            System.out.println("NIP NIE poprawny!!");
        }
    }
}
