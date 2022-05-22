package basicSyntaxMoreExercise;

import java.util.Locale;
import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double startBalance = currentBalance;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")){
            String currentGame = input;
            switch (currentGame){
                case "OutFall 4":
                    if (currentBalance < 39.99){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.println("Bought OutFall 4");
                        currentBalance -= 39.99;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (currentBalance < 39.99){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.println("Bought RoverWatch Origins Edition");
                        currentBalance -= 39.99;
                    }
                    break;
                case "CS: OG":
                    if (currentBalance < 15.99){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.println("Bought CS: OG");
                        currentBalance -= 15.99;
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance < 19.99){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.println("Bought Zplinter Zell");
                        currentBalance -= 19.99;
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance < 29.99){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.println("Bought RoverWatch");
                        currentBalance -= 29.99;
                    }
                    break;
                case "Honored 2":
                    if (currentBalance < 59.99){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.println("Bought Honored 2");
                        currentBalance -= 59.99;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentBalance == 0){
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. ", Math.abs(currentBalance - startBalance));
        System.out.printf("Remaining: $%.2f", currentBalance);
    }
}