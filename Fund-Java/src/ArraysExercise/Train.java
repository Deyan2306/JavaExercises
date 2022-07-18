package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] trainContainer = new int[numberOfWagons];

        int sumOfPeople = 0;
        for (int i = 0; i < numberOfWagons; i++) {
            int currentNumOfPeople = Integer.parseInt(scanner.nextLine());
            trainContainer[i] = currentNumOfPeople;
            sumOfPeople += currentNumOfPeople;
        }

        for (int n : trainContainer) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
