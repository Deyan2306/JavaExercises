package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class SquareofStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read integer
        int n = Integer.parseInt(scanner.nextLine());
        //Draw the figure
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
