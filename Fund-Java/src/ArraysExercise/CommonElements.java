package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        for (String current : arrOne){
            for (String s : arrTwo) {
                if (current.equals(s)) {
                    System.out.print(s + " ");
                    break;
                }
            }
        }
    }
}
