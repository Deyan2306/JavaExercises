package basicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Define the varibles
        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double singlePrice = 0;

        //Check the total price
        switch (day){
            case "Friday":
                switch (type) {
                    case "Students" -> singlePrice = 8.45;
                    case "Business" -> singlePrice = 10.90;
                    case "Regular" -> singlePrice = 15;
                }
                break;
            case "Saturday":
                singlePrice = switch (type) {
                    case "Students" -> 9.80;
                    case "Business" -> 15.60;
                    case "Regular" -> 20;
                    default -> singlePrice;
                };
                break;
            case "Sunday":
                singlePrice = switch (type) {
                    case "Students" -> 10.46;
                    case "Business" -> 16;
                    case "Regular" -> 22.50;
                    default -> singlePrice;
                };
                break;
        }

        //Look trough the discounts n sum
        if (number >= 100 && type.equals("Business")){
            number -= 10;
        }

        double totalPrice = singlePrice * number;

        if (number >= 30 && type.equals("Students")){
            totalPrice *= 0.85;
        }

        if (number >= 10 && number <= 20 && type.equals("Regular")){
            totalPrice *= 0.95;
        }

        //Print
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
