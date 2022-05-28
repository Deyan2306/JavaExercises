package dataTypesAndVariblesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (long i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            var theNums = input.split(" ");
            long numOne = Long.parseLong(theNums[0]);
            long numTwo = Long.parseLong(theNums[1]);

            long biggerNumber = numTwo;
                if (numOne > numTwo) {
                    biggerNumber = numOne;
                }

                long sumOfDigits = 0;
                while (biggerNumber != 0) {
                    sumOfDigits += biggerNumber % 10;
                    biggerNumber /= 10;
            }
            System.out.println(Math.abs(sumOfDigits));
        }
    }
}
