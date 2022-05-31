package conditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int secondsSum = firstTime + secondTime + thirdTime;
        int minutesTotal = secondsSum / 60;
        int secondsTotal = secondsSum % 60;

        if (secondsTotal < 10){
            System.out.printf("%s:0%s", minutesTotal, secondsTotal);
        } else {
            System.out.printf("%s:%s", minutesTotal, secondsTotal);
        }
    }
}
