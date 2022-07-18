package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);

        findTheCharsInBetween(startChar, endChar);
    }

    private static void findTheCharsInBetween (char start, char end) {
        if (start < end){
            for (int i = start + 1; i < end; i++) {
                if (i == end - 1){
                    System.out.println((char)i);
                } else {
                    System.out.print((char)i + " ");
                }
            }
        } else {
            for (int i = end + 1; i < start; i++) {
                if (i == start - 1){
                    System.out.println((char)i);
                } else {
                    System.out.print((char)i + " ");
                }
            }
        }

    }
}
