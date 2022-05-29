package firstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int littersChemical = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double penPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double chemicalPrice = littersChemical * 1.20;
        double totalPrice = penPrice + markersPrice + chemicalPrice;
        double PriceWithDiscount = totalPrice - (totalPrice * percentDiscount / 100);

        System.out.println(PriceWithDiscount);
    }
}
