package MidExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        String[] dungeonRooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < dungeonRooms.length; i++) {
            String command = dungeonRooms[i].split("\\s+")[0];
            int number = Integer.parseInt(dungeonRooms[i].split("\\s+")[1]);

            switch (command) {
                case "potion":
                    int firstHealth = initialHealth;
                    initialHealth += number;
                    int diffrence = 0;
                    if (initialHealth > 100) {
                        initialHealth = 100;
                        diffrence = initialHealth - firstHealth;
                        System.out.printf("You healed for %d hp.%n", diffrence);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                        break;
                    } else {
                        System.out.printf("You healed for %d hp.%n", number);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    break;
                case "chest":
                    initialBitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    initialHealth -= number;

                    if (initialHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", initialBitcoins);
        System.out.printf("Health: %d%n", initialHealth);
    }
}
