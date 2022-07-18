package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printTheSmallest(num1, num2, num3);
    }

    private static void printTheSmallest(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
}
