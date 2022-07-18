package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] rotateElements = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countRotations; i++) {
            String firstElement = rotateElements[0];
            for (int j = 0; j < rotateElements.length - 1; j++) {
                rotateElements[j] = rotateElements[j + 1];
            }
            rotateElements[rotateElements.length - 1] = firstElement;
        }
        for (String currentElementToPrint : rotateElements){
            System.out.print(currentElementToPrint + " ");
        }
    }
}