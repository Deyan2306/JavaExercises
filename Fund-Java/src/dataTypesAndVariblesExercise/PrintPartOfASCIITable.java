package dataTypesAndVariblesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        for (int i = numOne; i <= numTwo; i++) {
            System.out.print((char) i + " ");
        }
    }
}
