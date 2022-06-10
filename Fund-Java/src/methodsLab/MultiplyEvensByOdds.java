package methodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multiplied = multiplyEvenByOdd(num);
        System.out.println(Math.abs(multiplied));
    }

    public static int multiplyEvenByOdd(int number){
        int n = number;
        int evenSum = 0;
        int oddSum = 0;
        while (n != 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0){
                evenSum += lastDigit;
            } else {
                oddSum += lastDigit;
            }

            //Delete last element
            n /= 10;
        }

        int result = evenSum * oddSum;
        return result;
    }
}
