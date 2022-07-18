package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstLenght = input.length;

        for (int i = 0; i < firstLenght - 1; i++) {
            int[] condensed = new int[input.length - 1];
            for (int j = 0; j < input.length - 1; j++) {
                condensed[j] = input[j] + input[j + 1];
            }
            input = condensed;
        }

        System.out.println(input[0]);
    }
}
