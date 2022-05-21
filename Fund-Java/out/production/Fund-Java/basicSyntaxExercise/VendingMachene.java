package basicSyntaxExercise;

import java.util.Locale;
import java.util.Scanner;

public class VendingMachene {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double coins = 0;

        System.out.println("<<## USE FUNCTION 'START' TO BUY PRODUCTS ##>>");
        System.out.println("!!THE MACHINE ACCEPTS ONLY COINS FROM \n *0.1lv* *0.2lv* *0.5lv* *1.00lv* *2.00lv*!!");
        System.out.print("Insert a coin >> ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        while (!input.equals("start")) {
            switch (input) {
                case "0.1", "0.2", "0.5", "1", "2" -> coins += Double.parseDouble(input);
                default -> System.out.printf("Cannot accept %.02f%n", Double.parseDouble(input));
            }
            System.out.printf("BALANCE: %.2f%n", coins);
            System.out.print("Insert another coin >> ");
            input = scanner.nextLine();
        }
        // Start is entered
        System.out.println("<<## USE FUNCTION 'END' TO STOP BUYING PRODUCTS ##>>");
        System.out.println("AVAILABLE PRODUCTS:\n Nuts -> 2.00lv \n Water -> 0.70lv \n Crisps -> 1.50lv \n Soda -> 0.80lv \n Coke -> 1.00lv ");
        System.out.print("Insert the product's name >> ");

        input = scanner.nextLine().toLowerCase(Locale.ROOT);
        while (!input.equals("end")) {
            switch (input) {
                case "nuts":
                    if (coins < 2.0) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= 2.0;
                    }
                    break;
                case "water":
                    if (coins < .7) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= .7;
                    }
                    break;
                case "crisps":
                    if (coins < 1.5) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= 1.5;
                    }
                    break;
                case "soda":
                    if (coins < .8) System.out.println("Sorry, not enough money");
                    else {
                        System.out.println("Purchased " + input);
                        coins -= .8;
                    }
                    break;
                case "coke":
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
            System.out.printf("BALANCE: %.2f%n", coins);
            System.out.print("Insert another product's name >> ");
            input = scanner.nextLine();
        }
        System.out.println("<<## YOU SUCCESSFULLY DONE THE PAYMENT ##>>");
        System.out.printf("CHANGE: %.02f", coins);
    }
}
