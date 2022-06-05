package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine(). split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        int theMost = 0;
        int index = 0;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]){
                counter++;
            } else {
                counter = 0;
            }
            if (counter > theMost) {
                theMost = counter;
                index = input[i];
            }
        }
        for (int j = 0; j <= theMost; j++) {
            System.out.print(index + " ");
        }
    }
}