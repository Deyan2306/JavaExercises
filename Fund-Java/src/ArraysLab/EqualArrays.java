package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstNumCollection = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondNumCollection = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < firstNumCollection.length; i++) {
            if (firstNumCollection[i] == secondNumCollection[i]){
                sum += firstNumCollection[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
