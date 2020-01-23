package pl.sda.javakrk25.day3;

public class StringToTitleCase {

    private static String VOWELS = "aeyioąęuó";

    static String vowelsToUpperCase(String text) {
        char[] letters = text.toCharArray();
        String output = "";
        for (char letter : letters) {
            output += toUpperIfVowel(letter);
        }
        return output;
    }

    private static String toUpperIfVowel(char c) {
        String stringLetter = String.valueOf(c);
        if (VOWELS.contains(stringLetter)) {
            return stringLetter.toUpperCase();
        } else {
            return stringLetter;
        }
    }


    static String toTitleCase(String text) {
        String[] words = text.split(" ");
        String output = "";
        for (String word : words) {
            output += capitalize(word) + " ";
        }
        return output.trim();
    }

    private static String capitalize(String word) {
        String firstLetter = String.valueOf(word.charAt(0));
        String firstLetterUpperCase = firstLetter.toUpperCase();
        return word.replaceFirst(firstLetter, firstLetterUpperCase);
    }

    public static void main(String[] args) {
        String input = "i love java";
        String toTitleCase = toTitleCase(input);
        String vowelsToUpperCase = vowelsToUpperCase(input);

        System.out.println(String.format("toTittleCase -> %s", toTitleCase));
        System.out.println(String.format("vowelsToUpperCase -> %s", vowelsToUpperCase));

        String combinedResult = vowelsToUpperCase(toTitleCase);

        System.out.println(String.format("vowelsToUpperCase &&  toTittleCase-> %s", combinedResult));
    }
}
