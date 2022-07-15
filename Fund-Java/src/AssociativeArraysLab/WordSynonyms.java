package AssociativeArraysLab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> wordsAndSynonyms = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordsAndSynonyms.putIfAbsent(word, new ArrayList<>());
            wordsAndSynonyms.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> listEntry : wordsAndSynonyms.entrySet()) {
            System.out.printf("%s - %s%n", listEntry.getKey(), String.join(", ", listEntry.getValue()));
        }
    }
}
