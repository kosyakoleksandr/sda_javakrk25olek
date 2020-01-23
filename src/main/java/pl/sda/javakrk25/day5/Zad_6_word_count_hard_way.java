package pl.sda.javakrk25.day5;

public class Zad_6_word_count_hard_way {

    /**
     * Policz słowa
     *
     * @param args
     */
    public static void main(String[] args) {
        String sentence = " Some example sentence .";

        char[] letters = sentence.trim().toCharArray();
        int whiteSpaceCount = 0;
        for (char c : letters) {
            if (Character.isWhitespace(c)) {
                whiteSpaceCount++;
            }
        }
        System.out.println("The amount of words is: " + (whiteSpaceCount + 1));
    }
}
