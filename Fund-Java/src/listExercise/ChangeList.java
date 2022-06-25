package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ints = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int element = Integer.parseInt(command.split("\\s+")[1]);
                ints.remove(Integer.valueOf(element));
            } else if (command.contains("Insert")) {
                int elementToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int position = Integer.parseInt(command.split("\\s+")[2]);
                ints.add(position, elementToInsert);
            }
            command = scanner.nextLine();
        }

        for (int i : ints) {
            System.out.print(i + " ");
        }
    }
}
