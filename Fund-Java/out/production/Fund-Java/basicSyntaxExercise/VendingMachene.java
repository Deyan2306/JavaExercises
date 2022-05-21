package basicSyntaxExercise;

import java.util.Locale;
import java.util.Scanner;

public class VendingMachene {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double coins = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            switch (input) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    coins += Double.parseDouble(input);
                    break;
                default:
                    System.out.printf("Cannot accept %.02f", Double.parseDouble(input));
                    break;
            }
            input = scanner.nextLine();
        }
        // Start is entered
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (coins < 2.0) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= 2.0;
                    }
                    break;
                case "Water":
                    if (coins < .7) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= .7;
                    }
                    break;
                case "Crisps":
                    if (coins < 1.5) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= 1.5;
                    }
                    break;
                case "Soda":
                    if (coins < .8) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= .8;
                    }
                    break;
                case "Coke":
                    if (coins < 1.0) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.02f", coins);
    }
}
