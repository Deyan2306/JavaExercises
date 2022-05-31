package conditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60) + minutes + 15;
        int hrs = totalMinutes / 60;
        int mins = totalMinutes % 60;

        if (hrs > 23){
            hrs = 0;
        }
        if (mins < 10){
            System.out.printf("%s:0%s", hrs, mins);
        } else {
            System.out.printf("%s:%s", hrs, mins);
        }
    }
}
