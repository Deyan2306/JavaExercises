package arraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        for (String current : arrOne){
            for (int i = 0; i < arrTwo.length; i++) {
                if (current.equals(arrTwo[i])){
                    System.out.print(arrTwo[i] + " ");
                }
            }
        }
    }
}
