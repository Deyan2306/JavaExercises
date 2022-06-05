package arraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] treasure = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){
            String theCommand = command.split(" ")[0];
            switch (theCommand){
                case "Loot":
                    String[] lootableItems = command.split(" ");
                    for (int i = 1; i < lootableItems.length; i++) {
                        for (int check = 0; check < treasure.length; check++) {
                            if (treasure[check].equals(lootableItems[i])){
                                break;
                            } else {
                                treasure[check] = treasure[check + 1];
                                treasure[0] = lootableItems[i];
                            }
                        }
                    }
                    break;
                case "Drop":
                    String droppedIndex = command.split(" ")[1];
                    int integerDropped = Integer.parseInt(droppedIndex);
                    String dropped = treasure[integerDropped];
                    treasure[integerDropped] = "";
                    for (int i = integerDropped; i < treasure.length; i++) {
                        treasure[i] = treasure[i - 1];
                        if (treasure[treasure.length - 1].equals("")){
                            treasure[treasure.length - 1] = dropped;
                        } else {
                            break;
                        }
                    }
                    break;
                case "Steal":
                    String stolenIndex = command.split(" ")[1];
                    int integerStolen = Integer.parseInt(stolenIndex);
                    String stolen = treasure[integerStolen];
                    for (int i = treasure.length - 1; i <= treasure.length - integerStolen - 1; i++) {
                        treasure[i] = "";
                        if (i == integerStolen){
                            System.out.print(stolen);
                        } else {
                            System.out.print(stolen + ", ");
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        double averageTreasureGain = 0;
        for (int i = 0; i < treasure.length; i++) {
            averageTreasureGain += treasure[i].length();
        }
        averageTreasureGain /= treasure.length;

        System.out.println(String.join(", " + treasure));
        System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
    }
}

// To fix it later