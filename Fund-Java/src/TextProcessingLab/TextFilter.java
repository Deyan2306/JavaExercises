package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String currentWord = bannedWords[i];
            text = banWords(text, currentWord);
        }

        System.out.println(text);
    }

    private static String banWords(String text, String bannedWord) {
        String censors = "";
        int len = bannedWord.length();

        for (int i = 1; i <= len; i++) {
            censors += "*";
        }

        text = text.replace(bannedWord, censors);
        return text;
    }
}
