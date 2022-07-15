package AssociativeArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] filtered = Arrays.stream(scanner.nextLine().split("\\s+")).filter(e -> e.length() % 2 == 0).toArray(String[]::new);
        for (String item : filtered) {
            System.out.println(item);
        }
    }
}
