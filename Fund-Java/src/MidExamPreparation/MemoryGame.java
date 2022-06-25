package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Long::parseLong).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int indexOne = Integer.parseInt(input.split("\\s+")[0]);
            int indexTwo = Integer.parseInt(input.split("\\s+")[1]);
        }
    }
}
