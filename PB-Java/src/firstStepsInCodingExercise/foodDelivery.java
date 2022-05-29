package firstStepsInCodingExercise;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegiMenu =Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegiPrice = vegiMenu * 8.15;
        double NoDess = chickenPrice + fishPrice + vegiPrice;
        double Dessert = NoDess * 0.20;

        double tax = NoDess + Dessert + 2.50;
        System.out.printf("%.2f", tax);
    }
}
