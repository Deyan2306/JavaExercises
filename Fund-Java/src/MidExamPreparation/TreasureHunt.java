package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] items = input.split("\\s+");
            String command = items[0];
            switch (command) {
                case "Loot":
                    for (int item = 1; item < items.length; item++) {
                        if (!inventory.contains(items[item])) {
                            inventory.add(0, items[item]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(items[1]);
                    if (index >= 0 && index < inventory.size()) {
                        String item = inventory.get(index);
                        inventory.remove(index);
                        inventory.add(item);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(items[1]);
                    List<String> stolenItems = new ArrayList<>();
                    for (int i = 1; i <= count; i++) {
                        if (inventory.size() > 0) {
                            String currentItem = inventory.get(inventory.size() - 1);
                            stolenItems.add(0, currentItem);
                            inventory.remove(inventory.size() - 1);
                        } else {
                            break;
                        }
                    }
                    System.out.println(String.join(", ", stolenItems));
                    break;
            }

            input = scanner.nextLine();
        }

        if (inventory.size() <= 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            int itemsCost = 0;
            for (int i = 0; i < inventory.size(); i++) {
                String el = inventory.get(i);
                int cost = el.length();
                itemsCost += cost;
            }

            double averageIncome = itemsCost * 1.0 / inventory.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageIncome);
        }
    }
}
