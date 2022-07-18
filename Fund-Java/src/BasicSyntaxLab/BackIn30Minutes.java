package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursInMins = hours * 60;
        int totalTime = hoursInMins + minutes + 30;
        int hoursNew = totalTime / 60;
        int minutesNew = totalTime % 60;

        if (hoursNew >= 24){
            hoursNew -= 24;
        }

        System.out.printf("%d:%02d", hoursNew, minutesNew);
    }
}
