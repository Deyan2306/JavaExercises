package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numCollection = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int n : numCollection){
            if (n % 2 == 0){
                evenSum += n;
            } else {
                oddSum += n;
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
