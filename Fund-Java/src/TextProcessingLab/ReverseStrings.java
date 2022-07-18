package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String word = input;
            String reversedWord = reversedWordByChars(word);

            //Print the output
            System.out.println(word + " = " + reversedWord);    // could also work with formatted printing

            input = scanner.nextLine();
        }
    }

    private static String reversedWordByChars(String word) {
        String output = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char current = word.charAt(i);
            output += current;
        }

        return output;
    }
}
