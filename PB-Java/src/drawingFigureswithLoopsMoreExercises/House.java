package drawingFigureswithLoopsMoreExercises;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int startStars = 0;
        int nMinStars = (n - startStars) / 4;
        int rows = (n + 1) / 2;

        //Check the start stars
        if (n % 2 == 0){
            startStars = 2;
        } else {
            startStars = 1;
        }

        //Print the roof
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= nMinStars ; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= startStars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= nMinStars ; j++) {
                System.out.print("_");
            }
            System.out.println();
            nMinStars --;
            startStars += 2;
        }

        //Print the middle
        int rowsT = n / 2 - 1;

        for (int i = 0; i <= rowsT; i++) {
            System.out.print("|");
            for (int j = 0; j <= n / 2; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
