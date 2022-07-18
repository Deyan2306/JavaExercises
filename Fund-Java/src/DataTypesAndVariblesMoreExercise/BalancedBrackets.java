package DataTypesAndVariblesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long openingCount = 0;
        long closingCount = 0;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openingCount++;
            } else if (input.equals(")")){
                closingCount++;
                if (openingCount - closingCount != 0)
                {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }

        if (openingCount == closingCount){
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
