package pl.sda.javakrk25.day5;

public class Zad_5_flip_case {


    /**
     * Zamienić małe litery na duże i odwrotnie
     *
     * @param args
     */
    public static void main(String[] args) {
        String text = "tExf  ttT 743";
        char[] letters = text.toCharArray();
        String output = "";
        for (char c : letters) {
            if (Character.isUpperCase(c)) {
                output += Character.toLowerCase(c);
            } else if (Character.isLowerCase((c))) {
                output += Character.toUpperCase(c);
            } else {
                output += c;
            }
        }
        System.out.println(output);

    }


}
