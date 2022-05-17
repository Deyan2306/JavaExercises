package basicSyntaxLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        while (num % 2 != 0){
                System.out.println("Please write an even number.");
                num = Double.parseDouble(scanner.nextLine());
        }

        System.out.printf("The number is: %.0f", Math.abs(num));
    }
}
