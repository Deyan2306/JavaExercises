package BasicSyntaxExercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("## ENTER A NUMBER TO DRAW YOUR TRIANGLE ##");
        int n = Integer.parseInt(scanner.nextLine());

        int theNum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(theNum + " ");
            }
            theNum++;
            System.out.println();
        }
    }
}
