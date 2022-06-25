package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            if (input.contains("Add")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                listOfNumbers.add(number);
            } else if (input.contains("Insert")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);
                if (isValid(listOfNumbers, index)) {
                    listOfNumbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (input.contains("Remove")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                if (isValid(listOfNumbers, index)) {
                    listOfNumbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (input.contains("Shift left")) {
                int count = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int currNum = listOfNumbers.get(0);
                    listOfNumbers.remove(0);
                    listOfNumbers.add(currNum);
                }
            } else if (input.contains("Shift right")) {
                int count = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int lastNum = listOfNumbers.get(listOfNumbers.size() - 1);
                    listOfNumbers.remove(listOfNumbers.size() - 1);
                    listOfNumbers.add(0, lastNum);
                }
            }

            input = scanner.nextLine();
        }

        for (int i : listOfNumbers) {
            System.out.print(i + " ");
        }
    }

    public static boolean isValid (List<Integer> numbers, int index) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
