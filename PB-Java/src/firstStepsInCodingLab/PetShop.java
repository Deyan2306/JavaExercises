package firstStepsInCodingLab;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());

        double dogFoodR = dogFood * 2.5;
        double catFoodR = catFood * 4;
        double maxRazh = dogFoodR + catFoodR;

        System.out.println(maxRazh + " lv.");
}
