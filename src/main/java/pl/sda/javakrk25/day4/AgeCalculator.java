package pl.sda.javakrk25.day4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class AgeCalculator {

    private static int RETIREMENT_AGE = 60;

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1990, 11, 30);
        LocalDate today = LocalDate.now();

        Period age = Period.between(dateOfBirth, today);

        DayOfWeek dayOfBirth = dateOfBirth.getDayOfWeek();
        String dayOfBirthDisplay = dayOfBirth.getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.println("Urodziłeś(aś) się w : " + dayOfBirthDisplay);
        System.out.println(String.format("Masz %d lat i %d dni", age.getYears(), age.getDays()));

        LocalDate twiceAgeAsNow = today.plus(age);
        System.out.println("Będziesz 2x starszy niż teraz w tym dniu: " + twiceAgeAsNow);

        Period retirementPeriod = Period.ofYears(RETIREMENT_AGE);
        LocalDate retirementAt = dateOfBirth.plus(retirementPeriod);
        //  LocalDate retirementAt = dateOfBirth.plusYears(RETIREMENT_AGE);
        System.out.println("Na emeryturę przejdziesz: " + retirementAt);

        Period retirementLeft = Period.between(today, retirementAt);
        System.out.println(String.format("Do emerytury zostało %d lat %d miesięcy i %d dni ",
                retirementLeft.getYears(), retirementLeft.getMonths(), retirementLeft.getDays()));

    }
}
