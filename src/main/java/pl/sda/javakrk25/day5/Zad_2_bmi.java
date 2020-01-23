package pl.sda.javakrk25.day5;

public class Zad_2_bmi {
    public static double NIEDOWAGA = 18.5;
    public static double NADWAGA = 24.9;

    public static void main(String[] args) {
        bmi(50, 1.8f);
        bmi(70, 1.8f);
        bmi(90, 1.8f);
    }

    static void bmi(float weight, float height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi < NIEDOWAGA) {
            System.out.printf("Niedowaga %.2f\n", bmi);
        } else if (bmi > NADWAGA) {
            System.out.printf("Nadwaga %.2f\n", bmi);
        } else {
            System.out.printf("Waga prawidłowa %.2f\n", bmi);
        }
    }

}
