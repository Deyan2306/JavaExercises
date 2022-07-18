package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (DivEight(i) && DoesOdd(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean DivEight (int a) {
        int sumDigits = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            sumDigits += lastDigit;
            a /= 10;
        }
        return sumDigits % 8 == 0;
    }

    private static boolean DoesOdd (int a) {
        while (a > 0) {
            int lastDigit = a % 10;
            if (lastDigit % 2 == 1) {
                return true;
            }
            a /= 10;
        }

        return false;
    }
}
