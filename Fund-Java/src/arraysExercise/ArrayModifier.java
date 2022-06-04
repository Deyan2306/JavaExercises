package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] theParts = command.split(" ");
            String theCommand = theParts[0];
            switch (theCommand){
                case "swap":
                    int index1 = Integer.parseInt(theParts[1]);
                    int element1 = numbers[index1];
                    int index2 = Integer.parseInt(theParts[2]);
                    int element2 = numbers[index2];

                    numbers[index1] = element2;
                    numbers[index2] = element1;
                    break;
                case "multiply":
                    int MPindex1 = Integer.parseInt(theParts[1]);
                    int MPelement1 = numbers[MPindex1];
                    int MPindex2 = Integer.parseInt(theParts[2]);
                    int MPelement2 = numbers[MPindex2];

                    int product = MPelement1 * MPelement2;
                    numbers[MPindex1] = product;
                    break;
                case "decrease":
                    for (int index = 0; index <= numbers.length - 1; index++) {
                        numbers[index] = numbers[index] - 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i != numbers.length - 1){
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}
