package midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        int entryPrice = priceRatings.get(entryPoint);
        String typeOfItems = scanner.nextLine();
        int leftDamage = 0;
        int rightDamage = 0;

        List<Integer> leftItems = new ArrayList<>();
        List<Integer> rightItems = new ArrayList<>();

        //Left
        for (int i = 0; i < entryPoint; i++) {
            leftItems.add(priceRatings.get(i));
        }

        //Right
        for (int i = entryPoint + 1; i < priceRatings.size(); i++) {
            rightItems.add(priceRatings.get(i));
        }

        switch (typeOfItems) {
            case "cheap":
                for (int i = 0; i < leftItems.size(); i++) {
                    if (leftItems.get(i) < entryPrice) {
                        leftDamage += leftItems.get(i);
                    }
                }
                for (int i = 0; i < rightItems.size(); i++) {
                    if (rightItems.get(i) < entryPrice) {
                        rightDamage += rightItems.get(i);
                    }
                }
                break;
            case "expensive":
                for (int i = 0; i < leftItems.size(); i++) {
                    if (leftItems.get(i) >= entryPrice) {
                        leftDamage += leftItems.get(i);
                    }
                }
                for (int i = 0; i < rightItems.size(); i++) {
                    if (rightItems.get(i) >= entryPrice) {
                        rightDamage += rightItems.get(i);
                    }
                }
                break;
        }

        if (leftDamage >= rightDamage) {
            System.out.printf("Left - %d", leftDamage);
        } else {
            System.out.printf("Right - %d", rightDamage);
        }
    }
}


// Надявам се моята котка да не е толкова ядосана, че присъствам на изпита :)