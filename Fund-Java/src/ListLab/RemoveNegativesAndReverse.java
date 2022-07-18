package ListLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        nums.removeIf(e -> e < 0);
        Collections.reverse(nums);
        if (nums.isEmpty()){
            System.out.println("empty");
        } else {
            for (int i : nums) {
                System.out.print(i + " ");
            }
        }
    }
}
