package pl.sda.javakrk25.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressExtractor {

    //wydzielić numer domu z adresu
    public static void main(String[] args) {
        String adres = "ul.Słoneczna 189a";
        Pattern pattern = Pattern.compile("(.*)\\s([0-9]{1,4}[a-z]{0,1})");
        Matcher matcher = pattern.matcher(adres);

        if (matcher.find()) {
            String ulica = matcher.group(1);
            String nrDomu = matcher.group(2);
            System.out.println("ulica:" + ulica);
            System.out.println("nr domu:" + nrDomu);
        } else {
            System.out.println("Nic nie znaleziono");
        }

    }
}
