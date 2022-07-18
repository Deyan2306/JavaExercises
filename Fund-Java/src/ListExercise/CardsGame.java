package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHandful = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHandful = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while (firstHandful.size() > 0 && secondHandful.size() > 0) {
            if (firstHandful.get(0) > secondHandful.get(0)) {
                firstHandful.add(firstHandful.get(0));
                firstHandful.add(secondHandful.get(0));
                firstHandful.remove(0);
                secondHandful.remove(0);
            } else if (secondHandful.get(0) > firstHandful.get(0)) {
                secondHandful.add(secondHandful.get(0));
                secondHandful.add(firstHandful.get(0));
                firstHandful.remove(0);
                secondHandful.remove(0);
            } else {
                firstHandful.remove(0);
                secondHandful.remove(0);
            }
        }
        int sum = 0;
        if (firstHandful.size() == 0) {
            for (Integer card : secondHandful) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (Integer card : firstHandful) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
