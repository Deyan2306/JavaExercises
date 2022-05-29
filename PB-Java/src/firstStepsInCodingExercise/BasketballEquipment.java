package firstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax = Double.parseDouble(scanner.nextLine());
        double sneakers = tax - (tax * 0.40);
        double suit = sneakers - (sneakers * 0.20);
        double ball = suit / 4;
        double accesoaries = ball / 5;
        double overall = tax + sneakers + suit + ball + accesoaries;
        System.out.printf("%.2f", overall);
    }
}
