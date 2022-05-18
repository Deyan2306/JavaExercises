package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vars
        int number = Integer.parseInt(scanner.nextLine());
        int col = number - 2;

        //Draw Top Part
        System.out.print("+ ");
        for (int i = 1; i <= col; i++) {
            System.out.print("- ");
        }
        System.out.print("+");
        System.out.println();

        //Draw Middle Part
        for (int i = 1; i <= col; i++) {
            System.out.print("| ");
            for (int j = 1; j <= col; j++) {
                System.out.print("- ");
            }
            System.out.print("|");
            System.out.println();
        }

        //Draw Bottom Part
        System.out.print("+ ");
        for (int i = 1; i <= col; i++) {
            System.out.print("- ");
        }
        System.out.print("+");
    }
}
