package midExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffees = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int commandCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandCount; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String executableCommand = commands[0];

            switch (executableCommand) {
                case "Include":
                    String coffee = commands[1];
                    coffees.add(coffee);
                    break;
                case "Remove":
                    String firstOrLast = commands[1];
                    int numberOfCoffees = Integer.parseInt(commands[2]);
                    switch (firstOrLast) {
                        case "first":
                            if (coffees.size() > numberOfCoffees) {
                                for (int j = 1; j <= numberOfCoffees; j++) {
                                    coffees.remove(0);
                                }
                            }
                            break;
                        case "last":
                            if (coffees.size() > numberOfCoffees) {
                                for (int j = 1; j <= numberOfCoffees; j++) {
                                    coffees.remove(coffees.size() - 1);
                                }
                            }
                            break;
                    }
                    break;
                case "Prefer":
                    int coffeeIndexOne = Integer.parseInt(commands[1]);
                    int coffeeIndexTwo = Integer.parseInt(commands[2]);

                    if (coffeeIndexOne >= 0 && coffeeIndexTwo <= coffees.size() - 1) {
                        String coffeeOne = coffees.get(coffeeIndexOne);
                        String coffeeTwo = coffees.get(coffeeIndexTwo);

                        coffees.set(coffeeIndexOne, coffeeTwo);
                        coffees.set(coffeeIndexTwo, coffeeOne);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
            }
        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffees));
    }
}
