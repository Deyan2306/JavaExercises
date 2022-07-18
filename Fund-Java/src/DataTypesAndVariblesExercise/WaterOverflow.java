package DataTypesAndVariblesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        int total = 0;
        for (int i = 1; i <= n; i++) {
            int currentWater = Integer.parseInt(scanner.nextLine());
            if (startCapacity - currentWater >= 0){
                total += currentWater;
                startCapacity -= currentWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(total);
    }
}
