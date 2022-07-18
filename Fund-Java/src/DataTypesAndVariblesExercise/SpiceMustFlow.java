package DataTypesAndVariblesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yieldHP = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpices = 0;
        while (yieldHP >= 100) {
            int spices = yieldHP - 26;
            totalSpices += spices;
            days++;
            yieldHP -= 10;
        }
        System.out.println(days);
        if (totalSpices >= 26) {
            totalSpices -= 26;
        }
        System.out.println(totalSpices);
    }
}
