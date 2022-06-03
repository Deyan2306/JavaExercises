package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current % 2 == 0){
                sum += current;
            }
        }
        System.out.println(sum);
    }
}
