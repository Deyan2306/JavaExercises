package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i++) {
            int nMin = number - i;
            int iterator = i - 1;
            //Draw the left side
            for (int j = 0; j < nMin; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= iterator; j++) {
                System.out.print("*");
            }

            //Draw the middle
            System.out.print(" | ");

            //Draw the right side
            for (int j = 0; j <= iterator; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < nMin; k++) {
                System.out.print(" ");
            }

            iterator++;
            System.out.println();
        }
    }
}
