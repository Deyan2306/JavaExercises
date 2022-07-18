package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputList = input.split("\\s+");
        LinkedHashMap<String, Integer> backpack = new LinkedHashMap<>();
        backpack.put("shards", 0);
        backpack.put("fragments", 0);
        backpack.put("motes", 0);

        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();

        for (int i = 0; i < inputList.length; i += 2) {
            int quantity = Integer.parseInt(inputList[i]);
            String item = inputList[i + 1].toLowerCase();

            if (!backpack.containsKey(item)) {
                if (!junk.containsKey(item)) {
                    junk.put(item, 0);
                }
                int n = junk.get(item);
                junk.put(item, n + quantity);
            } else {
                int firstN = backpack.get(item);
                backpack.put(item, firstN + quantity);
            }

            if (backpack.get("shards") >= 250 || backpack.get("motes") >= 250 || backpack.get("fragments") >= 250 ) {
                break;
            }
        }


    }
}
