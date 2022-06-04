package arraysExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rotatable = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < countRotations; i++) {
            String firstEl = rotatable[0];

            for (int j = 0; j < rotatable.length - 1; j++) {
                rotatable[j] = rotatable[j + 1];
            }
            rotatable[0] = firstEl;
        }

        for (String el : rotatable) {
            System.out.print(el + " ");
        }
    }
}
