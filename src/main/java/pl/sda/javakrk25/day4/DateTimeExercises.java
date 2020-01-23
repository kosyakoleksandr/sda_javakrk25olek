package pl.sda.javakrk25.day4;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeExercises {

    public static void main(String[] args) {
        //podpunkt 1,2
        Clock clock = Clock.system(ZoneId.of("America/Sao_Paulo"));
        LocalDateTime now = LocalDateTime.now().minus(1, ChronoUnit.DAYS);
        DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("dd.MM.yyyy. hh:mm a");
        System.out.println("Czas to " + dateTimeFormater.format(now));

        //podpunkt 3,4
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter inputFormater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputDateTime = null;
        System.out.println("Podaj datę w formacie yyyy-MM-dd");

        String input = scanner.next();
        inputDateTime = LocalDate.parse(input, inputFormater);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Czas po przeformatowaniu to " + dateFormatter.format(inputDateTime));
    }

}
