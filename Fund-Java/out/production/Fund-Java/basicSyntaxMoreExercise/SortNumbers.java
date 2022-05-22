package basicSyntaxMoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        if (numThree > numTwo && numTwo > numOne){
            System.out.println(numThree);
            System.out.println(numTwo);
            System.out.println(numOne);
        } else if (numTwo > numThree && numThree > numOne){
            System.out.println(numTwo);
            System.out.println(numThree);
            System.out.println(numOne);
        } else if (numOne > numTwo && numTwo > numThree){
            System.out.println(numOne);
            System.out.println(numTwo);
            System.out.println(numThree);
        } else if (numThree > numOne && numOne > numTwo){
            System.out.println(numThree);
            System.out.println(numOne);
            System.out.println(numTwo);
        } else if (numTwo > numOne && numOne > numThree){
            System.out.println(numTwo);
            System.out.println(numOne);
            System.out.println(numThree);
        } else if (numOne > numThree && numThree > numTwo){
            System.out.println(numOne);
            System.out.println(numThree);
            System.out.println(numTwo);
        } else if (numThree > numTwo && numTwo == numOne){
            System.out.println(numThree);
            System.out.println(numTwo);
            System.out.println(numTwo);
        } else if (numTwo > numThree && numThree == numOne){
            System.out.println(numTwo);
            System.out.println(numOne);
            System.out.println(numOne);
        } else if (numOne > numTwo && numTwo == numThree){
            System.out.println(numOne);
            System.out.println(numTwo);
            System.out.println(numTwo);
        }

    }
}
