package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase(Locale.ROOT);
        findVowels(text);
    }

    private static void findVowels (String text) {
        String[] vowelsFind = text.split("|");
        int vowelsCount = 0;
        for (int i = 0; i < vowelsFind.length; i++) {
            if (vowelsFind[i].equals("a") || vowelsFind[i].equals("e") || vowelsFind[i].equals("i") || vowelsFind[i].equals("o") || vowelsFind[i].equals("u")) {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}