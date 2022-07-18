package DataTypesAndVariblesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String formula = "";
        double maxValue = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (value >= maxValue) {
                maxValue = value;
                formula = String.format("%d : %d = %.0f (%d)", snowballSnow, snowballTime, value, snowballQuality);
            }
        }
        System.out.println(formula);
    }
}