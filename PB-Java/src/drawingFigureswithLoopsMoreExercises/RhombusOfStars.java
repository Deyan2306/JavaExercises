package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //Draw Top Part
        int nMinRow = n - 1;
        int nMinRowDob = n - (n-1);

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= nMinRow; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nMinRowDob; k++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= nMinRow; j++) {
                System.out.print(" ");
            }
            System.out.println();
            nMinRow--;
            nMinRowDob++;
        }

        //Draw The Middle Part
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        //Draw The Bottom Part
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j <= nMinRow; j++) {
                System.out.print(" ");
            }
            nMinRowDob--;
            for (int k = 1; k <= nMinRowDob; k++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= nMinRow; j++) {
                System.out.print(" ");
            }
            System.out.println();
            nMinRow++;
        }
    }
}
