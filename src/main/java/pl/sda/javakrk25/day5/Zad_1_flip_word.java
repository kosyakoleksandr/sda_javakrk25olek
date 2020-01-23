package pl.sda.javakrk25.day5;

public class Zad_1_flip_word {


    public static void main(String[] args) {
        String text = "Some text to flip";

        flip(text);
        flipWithFor(text);
    }

    private static void flip(String text) {
        char[] textArray = text.toCharArray();
        String out = "";

        for (int i = textArray.length - 1; i >= 0; i--) {
            out += textArray[i];
        }

        System.out.println(out);
    }


    private static void flipWithFor(String text) {
        char[] textArray = text.toCharArray();
        char[] out = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            int indexToSave = textArray.length - 1 - i;
            out[indexToSave] = textArray[i];
        }

        System.out.println(String.valueOf(out));
    }

}
