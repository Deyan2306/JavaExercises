package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap <Character, Integer> charsToNum = new LinkedHashMap<>();

        for (char current : input.toCharArray()) {
            if (current == ' ') {
                continue;
            }

            if (!charsToNum.containsKey(current)) {
                charsToNum.put(current, 0);
            }

            int getN = charsToNum.get(current);
            charsToNum.put(current, getN + 1);
        }

        for (Map.Entry<Character, Integer> integerEntry : charsToNum.entrySet()) {
            System.out.printf("%s -> %d%n", integerEntry.getKey(), integerEntry.getValue());
        }

    }
}
