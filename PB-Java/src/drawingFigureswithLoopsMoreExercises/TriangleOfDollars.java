package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read the vars
        int number = Integer.parseInt(scanner.nextLine());
        int cols = 1;

        //Draw the triangle
        for (int i = cols; i <= number; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("$ ");
            }
            cols++;
            System.out.println();
        }
    }
}
