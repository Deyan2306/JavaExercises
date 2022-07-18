package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word1 = input.split("\\s+")[0];
        String word2 = input.split("\\s+")[1];

        totsum(word1, word2);
    }

    private static void totsum(String word1, String word2) {
        int totalSum = 0;
        if (word1.length() >= word2.length()) {
            int len = word2.length();
            String subWord1 = word1.substring(0, len);
            String extract = word1.substring(len);

            for (int i = 0; i < word2.length(); i++) {
                char char1 = subWord1.charAt(i);
                char char2 = word2.charAt(i);

                int totalMulti = (int)char1 * char2;
                totalSum += totalMulti;
            }

            if (extract.length() > 0) {
                for (char extracted : extract.toCharArray()) {
                    totalSum += (int)extracted;
                }
            }
        } else {
            int len = word1.length();
            String subWord2 = word2.substring(0, len);
            String extract = word2.substring(len);

            for (int i = 0; i < word1.length(); i++) {
                char char1 = subWord2.charAt(i);
                char char2 = word1.charAt(i);

                int totalMulti = (int)char1 * char2;
                totalSum += totalMulti;
            }

            for (char extracted : extract.toCharArray()) {
                totalSum += (int)extracted;
            }
        }

        System.out.println(totalSum);
    }
}
