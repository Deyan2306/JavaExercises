package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String output = "";

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int repeatTimes = currentWord.length();

            for (int j = 1; j <= repeatTimes; j++) {
                output += currentWord;
            }
        }

        System.out.println(output);
    }
}
