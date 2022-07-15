package AssociativeArraysLab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> languages = new LinkedHashMap<>();
        List<String> positiveWords = new ArrayList<>();
        String words = scanner.nextLine().toLowerCase();
        String[] wordList = words.split("\\s+");

        //Write in
        for (String item : wordList) {
            if (!languages.containsKey(item)) {
                languages.put(item, 1);
            }
            int num = languages.get(item);
            languages.put(item, num + 1);
        }

        //Check
        for (Map.Entry<String, Integer> entry : languages.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                positiveWords.add(entry.getKey());
            }
        }

        //Print
        String result = String.join(", ", positiveWords);
        System.out.println(result);
    }
}
