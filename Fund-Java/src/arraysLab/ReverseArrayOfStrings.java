package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrInput = scanner.nextLine().split(" ");

        for (int i = arrInput.length - 1; i >=  0; i--) {
            System.out.print(arrInput[i] + " ");
        }
    }
}
