package conditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForTheMovie = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());
        double decor = budgetForTheMovie * 0.10;
        double clothes = clothesPrice * statistCount;
        double total = clothes + decor;
        double discount = 0;

        if (statistCount > 150) {
            discount = clothes * 0.10;
        }

        double totalDisc = total - discount;
        double diff = Math.abs(budgetForTheMovie - totalDisc);

        if (budgetForTheMovie < totalDisc){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
