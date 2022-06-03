package firstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double fishTankV = lenght * width * height;
        double litters = fishTankV * 0.001;
        double tknPlace = percent / 100;
        double needed = litters * (1 - tknPlace);

        System.out.println(needed);
    }
}
