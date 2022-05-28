package dataTypesAndVariblesMoreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= n; i++) {
            boolean isValid = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isValid = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isValid);
        }
    }
}
