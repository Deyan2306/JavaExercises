package conditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double totalTime = time * distanceMeters;
        double slowing = Math.floor(distanceMeters / 15);
        double slowTime = slowing * 12.5;
        double totalTimeWithSlowing = slowTime + totalTime;
        double diff = Math.abs(totalTimeWithSlowing - recordSec);
        boolean record;

        if (Double.compare(recordSec, totalTimeWithSlowing) <= 0){
            record = true;
        } else {
            record = false;
        }

        if (!record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeWithSlowing);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
