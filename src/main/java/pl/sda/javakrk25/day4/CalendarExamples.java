package pl.sda.javakrk25.day4;

import java.util.Calendar;

public class CalendarExamples {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // calendar.set(Calendar.YEAR, 2020);
        for (int m = 0; m < 12; m++) {
            calendar.set(Calendar.MONTH, m);
            int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println((m + 1) + "-> " + maxDayOfMonth);
        }

        System.out.println("Przestepny? " + przestepny(2019));

    }

    private static boolean przestepny(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, 1);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return maxDayOfMonth > 28;
    }
}
