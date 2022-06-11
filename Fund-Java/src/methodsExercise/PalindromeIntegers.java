package methodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (IsItPalindrome(input)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    public static boolean IsItPalindrome (String text) {
        int[] num = Arrays.stream(text.split("|")).mapToInt(Integer::parseInt).toArray();

        int itter = 1;
        for (int n : num) {
            if (n != num[num.length - itter]) {
                return false;
            }
            itter++;
        }
        return true;
    }
}
