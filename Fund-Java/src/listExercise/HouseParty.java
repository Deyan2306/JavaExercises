package listExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> party = new ArrayList<>();
        String input = scanner.nextLine();

        int timesRepeated = 0;
        while (true) {
            String name = input.split("\\s+")[0];
            if (input.contains("not")) {
                if (!party.contains(String.valueOf(name))) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    party.remove(String.valueOf(name));
                }
            } else if (input.contains("going")) {
                if (party.contains(String.valueOf(name))) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    party.add(name);
                }
            }

            timesRepeated++;
            if (timesRepeated == numberOfCommands) {
                break;
            }
            input = scanner.nextLine();
        }

        for (String Str : party) {
            System.out.println(Str);
        }
    }
}
