package methodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(width, lenght);
        System.out.printf("%.0f", area);
    }
    public static double calculateRectangleArea(double width, double length) {
        double area = width * length;
        return area;
    }
}
