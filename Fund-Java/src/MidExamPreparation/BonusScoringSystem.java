package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = Double.MIN_VALUE;
        int totalAttendanceLectures = 0;
        for (int i = 1; i <= numberOfStudents; i++) {
            int totalAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = totalAttendances * 1.0 / lecturesCount * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                totalAttendanceLectures = totalAttendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", totalAttendanceLectures);
    }
}
