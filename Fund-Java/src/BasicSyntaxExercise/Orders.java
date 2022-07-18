package BasicSyntaxExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= countOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double priceOfCofee = ((daysInMonth * capsulesCount) * pricePerCapsule);
            total += priceOfCofee;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOfCofee);
        }

        System.out.printf("Total: $%.2f", total);
    }
}