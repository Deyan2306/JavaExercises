package conditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double totalBreak = breakTime / 4.0;

        double timeLeft = breakTime - lunchTime - totalBreak;
        double afterEpisode = Math.abs(timeLeft - episodeTime);

        if (timeLeft >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    name, Math.ceil(afterEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    name, Math.ceil(afterEpisode));
        }
    }
}
