package DataTypesAndVariblesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            int decryptedChar = currentChar + key;
            System.out.print((char)decryptedChar);
        }
    }
}
