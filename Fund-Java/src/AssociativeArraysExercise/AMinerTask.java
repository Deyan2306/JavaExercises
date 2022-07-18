package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap <String, Integer> items = new LinkedHashMap<>();

        while (true) {
            String item = scanner.nextLine();
            if (item.equals("stop")) {
                break;
            }
            String quantity = scanner.nextLine();
            if (quantity.equals("stop")) {
                break;
            }

            int intQuant = Integer.parseInt(quantity);

            if (!items.containsKey(item)) {
                items.put(item, 0);
            }
            int currentQuantity = items.get(item);
            items.put(item, currentQuantity + intQuant);
        }

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
