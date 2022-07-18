package TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> letter = new ArrayList<>();
        List<Character> digit = new ArrayList<>();
        List<Character> other = new ArrayList<>();

        for (char item : input.toCharArray()) {
            if (Character.isDigit(item)) {
                digit.add(item);
            } else if (Character.isLetter(item)) {
                letter.add(item);
            } else {
                other.add(item);
            }
        }

        for (char item : digit) {
            System.out.print(item);
        }
        System.out.println();
        for (char item : letter) {
            System.out.print(item);
        }
        System.out.println();
        for (char item : other) {
            System.out.print(item);
        }
    }
}
