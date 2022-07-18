package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        calculate(product, numberOfProducts);
    }

    public static void calculate(String product, int num){
        double result = 0;
        switch (product) {
            case "coffee":
                result = num * 1.50;
                break;
            case "water":
                result = num * 1.00;
                break;
            case "coke":
                result = num * 1.40;
                break;
            case "snacks":
                result = num * 2.00;
                break;
        }

        System.out.printf("%.2f", result);
    }
}
