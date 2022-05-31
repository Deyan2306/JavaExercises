package conditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int graphicCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double discount = 0;

        double videoCardPrice = graphicCard * 250.0;
        double processorPrice = videoCardPrice * 0.35 * processor;
        double ramPrice = videoCardPrice * 0.10 * ram;

        double totalTax = videoCardPrice + processorPrice + ramPrice;
        if (graphicCard > processor){
            discount = totalTax * 0.15;
        }
        double total = totalTax - discount;
        boolean isEnough = total <= budget;
        double left = Math.abs(budget - total);

        if (isEnough) {
            System.out.printf("You have %.2f leva left!", left);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", left);
        }
    }
}
