package firstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageCount = Integer.parseInt(scanner.nextLine());
        int pageHour = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int totalReadingTime = pageCount / pageHour;
        int needed = totalReadingTime / daysCount;

        System.out.println(needed);
    }
}
