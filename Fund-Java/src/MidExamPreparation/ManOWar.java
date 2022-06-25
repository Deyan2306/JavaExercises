package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">")).toList();
        List<String> warShipStatus = Arrays.stream(scanner.nextLine().split(">")).toList();
        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] commandStuff = command.split("\\s+");
            String input = commandStuff[0];

            switch (input) {
                case "Fire":
                    int index = Integer.parseInt(commandStuff[1]);
                    int damage = Integer.parseInt(commandStuff[2]);
                    if (index >= 0 && index < warShipStatus.size()) {
                        int currentHealth = Integer.parseInt(warShipStatus.get(index));
                        int healthAfter = currentHealth - damage;

                        if (healthAfter > 0) {
                            warShipStatus.set(index, String.valueOf(healthAfter));
                        } else {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    break;
                case "Repair":
                    break;
                case "Status":
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
