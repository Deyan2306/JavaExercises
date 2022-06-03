package firstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int chemical = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double plasticPrice = (plastic + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.10)) * 14.50;
        double chemicalPrice = chemical * 5.00;
        double total = plasticPrice + paintPrice + chemicalPrice + 0.40;
        double totalWork = (total * 0.30) * hours;
        double sum = total + totalWork;

        System.out.printf("%.2f", sum);
    }
}
