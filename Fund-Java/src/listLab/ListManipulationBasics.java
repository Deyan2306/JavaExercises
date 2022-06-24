package listLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split("\\s+")[1]);
                    numbers.add(number);
            } else if (command.contains("RemoveAt")) {
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    if (isValid(numbers, index)){
                        numbers.remove(index);
                    }
            } else if (command.contains("Remove")) {
                int number = Integer.parseInt(command.split("\\s+")[1]);
                    numbers.remove(Integer.valueOf(number));
            } else if (command.contains("Insert")){
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValid(numbers, index)){
                    numbers.add(index, number);
                }
            }
            command = scanner.nextLine();
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static boolean isValid (List<Integer> numbers, int number){
        return number <= numbers.size() && number >= 0;
    }
}
