package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("Add")) {
                int passengers = Integer.parseInt(input.split("\\s+")[1]);
                train.add(passengers);
            } else {
                int passengersToFit = Integer.parseInt(input);
                for (int i = 0; i < train.size(); i++) {
                    if (passengersToFit + train.get(i) <= maxCapacity) {
                        int currentPeople = train.get(i);
                        int sum = currentPeople + passengersToFit;
                        train.set(i, sum);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int i : train) {
            System.out.print(i + " ");
        }
    }
}
