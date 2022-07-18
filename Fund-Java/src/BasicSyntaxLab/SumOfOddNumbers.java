package BasicSyntaxLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int iteration = 1;
        for (int i = 1; iteration <= n; i++) {
            if (i % 2 == 1){
                System.out.println(i);
                iteration++;
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
