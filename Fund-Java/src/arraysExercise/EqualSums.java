package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <= nums.length - 1; index++) {
            int currentEl = nums[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < index; i++) {
                leftSum += nums[i];
            }

            for (int i = index + 1; i <= nums.length - 1; i++) {
                rightSum += nums[i];
            }

            if (leftSum == rightSum){
                System.out.println(index);
                return;
            }

        }

        System.out.println("no");
    }
}
