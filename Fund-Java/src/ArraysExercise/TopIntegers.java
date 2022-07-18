package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerBox = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < integerBox.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < integerBox.length; j++) {
                if (integerBox[i] <= integerBox[j]) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.print(integerBox[i] + " ");
            }
        }
    }
}