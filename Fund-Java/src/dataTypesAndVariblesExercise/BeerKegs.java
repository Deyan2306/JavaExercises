package dataTypesAndVariblesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String theBiggestModel = "";
        double theBiggest = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            //Parameters
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > theBiggest){
                theBiggestModel = model;
                theBiggest = volume;
            }
        }

        System.out.println(theBiggestModel);
    }
}
