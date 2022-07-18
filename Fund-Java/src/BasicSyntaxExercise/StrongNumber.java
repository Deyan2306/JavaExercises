package BasicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int sum = 0;

        while (num > 0){
            int lastDigit = num % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == startNum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
