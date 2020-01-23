package pl.sda.javakrk25.day5;

public class Zad_3_sentence_exercises {

    public static void main(String[] args) {
        String sentence = "Some example sentence which is not too long";
        System.out.println("flip words:");
        flipWordsInSentence(sentence);

        System.out.println();
        System.out.println("words with even number of letters");
        wordsWithEvenLettersNumber(sentence);

        System.out.println();
        System.out.println("words with given suffix");
        wordsWithGivenSuffix(sentence, 'e');
    }


    private static void wordsWithGivenSuffix(String sentence, char suffix) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.endsWith(String.valueOf(suffix))) {
                System.out.println(word);
            }
        }
    }

    private static void wordsWithEvenLettersNumber(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    private static void flipWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        String out = "";

        for (int i = words.length - 1; i >= 0; i--) {
            out += words[i] + " ";
        }

        System.out.println(out.trim());
    }
}
