package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrInput = scanner.nextLine().split(" ");

        for (int i = 0; i < arrInput.length / 2; i++) {
            String oldEl = arrInput[i];
            arrInput[i] = arrInput[arrInput.length - 1 - i];
            arrInput[arrInput.length - 1 - i] = oldEl;
        }
        System.out.println(String.join(" ", arrInput));
    }

    //        for (int i = arrInput.length - 1; i >=  0; i--) {
    //            System.out.print(arrInput[i] + " ");
    //        }
}
