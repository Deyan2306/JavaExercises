package labObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Random rnd = new Random();

        while (!words.isEmpty()) {
            int randomIndex = rnd.nextInt(words.size());
            System.out.println(words.get(randomIndex));
            words.remove(randomIndex);
        }
    }
}
