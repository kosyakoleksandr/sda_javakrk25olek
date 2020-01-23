package pl.sda.javakrk25.day4;

import java.time.Duration;
import java.time.LocalTime;

public class CountDownTimer {

    private static LocalTime END = LocalTime.MAX;

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime now = LocalTime.now();
            Duration timeLeft = Duration.between(now, END);
            System.out.println(String.format("Do końca dnia pozostało: %d sekund",
                    timeLeft.toSeconds()));

            Thread.sleep(1000);
        }
    }

}
