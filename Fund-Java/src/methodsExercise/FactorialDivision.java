package methodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        factDivide(numOne, numTwo);
    }

    private static void factDivide(int a, int b) {
        double first = factIt(a);
        double second = factIt(b);

        double divided = first / second;
        System.out.printf("%.2f", divided);
    }
    
    private static double factIt (int a) {
        double rez = 1;
        double num = a;
        for (double i = num; i >= 1; i--) {
            rez *= i;
        }
        return rez;
    }
}
