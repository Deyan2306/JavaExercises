package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddle(text);
    }

    private static void printMiddle (String text) {
        //If the length is even
        if (text.length() % 2 == 0) {
            int indexFirst = text.length() / 2 - 1;
            int indexSecond = text.length() / 2;
            System.out.println(text.charAt(indexFirst) + "" + text.charAt(indexSecond));
        } else {
        //If the length is odd
            int indexOfMiddle = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddle));
        }
    }
}
