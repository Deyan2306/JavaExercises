package DataTypesAndVariblesExercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());
        int numFour = Integer.parseInt(scanner.nextLine());

        int result = ((numOne + numTwo) / numThree) * numFour;
        System.out.println(result);
    }
}
