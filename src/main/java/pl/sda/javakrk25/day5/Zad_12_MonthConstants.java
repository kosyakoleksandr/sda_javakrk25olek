package pl.sda.javakrk25.day5;

public class Zad_12_MonthConstants {
    private static final String JAN = "January";
    private static final String FEB = "February";
    private static final String MAR = "March";
    private static final String APRDEC = "Apr-Dec";

    public static String getMonthNameBy(int number) {
        switch (number) {
            case 1:
                return JAN;
            case 2:
                return FEB;
            case 3:
                return MAR;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return APRDEC;
            default:
                return "Unknown month number: " + number;
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            String monthNameBy = Zad_12_MonthConstants.getMonthNameBy(i);
            System.out.println(String.format("Miesiąc nr %d : %s", i, monthNameBy));
        }
    }
}
