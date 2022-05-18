package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //Print the top line
        for (int i = 1; i <= 2*n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= 2*n; i++) {
            System.out.print("*");
        }
        System.out.println();

        //Print the middle rows
        for (int i = 1; i <= n-2 ; i++) {
            boolean isValid = i == (n-1) / 2;
            System.out.print("*");
            for (int j = 1; j <= 2*n-2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (isValid){
                for (int j = 1; j <= n; j++) {
                    System.out.print("|");
                }
            } else {
                for (int m = 1; m <= n; m++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int j = 1; j <= 2*n-2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }

        //Print the bottom part
        for (int i = 1; i <= 2*n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= 2*n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
