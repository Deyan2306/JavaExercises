package firstStepsInCodingLab;
import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        double fullPrice = input * 7.61;
        double discount = fullPrice * 0.18;
        double finalPrice = fullPrice - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv", discount);
}
