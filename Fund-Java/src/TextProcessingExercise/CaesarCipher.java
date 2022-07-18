package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toEncrypt = scanner.nextLine();
        String output = "";
        for (char character : toEncrypt.toCharArray()) {
            int index = (int)character + 3;
            output += (char)index;
        }

        System.out.println(output);
    }
}
