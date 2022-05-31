package conditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int talkingDollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int toyTrucksCount = Integer.parseInt(scanner.nextLine());
        int totalCount = puzzleCount + talkingDollsCount + teddyBearsCount + minionsCount + toyTrucksCount;

        double puzzleTax = puzzleCount * 2.60;
        double dollTax = talkingDollsCount * 3;
        double tbTax = teddyBearsCount * 4.10;
        double minionTax = minionsCount * 8.20;
        double truckTax = toyTrucksCount * 2;
        double totalSum = puzzleTax + dollTax + tbTax + minionTax + truckTax;
        double discount = 0;

        if (totalCount >= 50){
            discount = totalSum * 0.25;
        }

        double rent = (totalSum - discount) * 0.10;
        double finallTax = totalSum - discount - rent;
        double after = Math.abs(finallTax - excursionPrice);

        if (finallTax >= excursionPrice){
            System.out.printf("Yes! %.2f lv left.", after);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", after);
        }
    }
}
