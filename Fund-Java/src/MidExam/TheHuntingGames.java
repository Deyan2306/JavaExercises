package MidExam;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfTheAdventure = Integer.parseInt(scanner.nextLine());
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayForOne = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOne = Double.parseDouble(scanner.nextLine());

        //Calculated
        double totalWater = daysOfTheAdventure * numberOfPlayers * waterPerDayForOne;
        double totalFood = daysOfTheAdventure * numberOfPlayers * foodPerDayForOne;

        for (int i = 1; i <= daysOfTheAdventure; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            if ((groupEnergy - energyLoss) <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.%n", totalFood, totalWater);
                return;
            }
            groupEnergy -= energyLoss;

            if (i % 2 == 0) {
                groupEnergy *= 1.05;
                totalWater *= 0.70;
            }

            if (i % 3 == 0) {
                double foodReduce = totalFood / numberOfPlayers;
                totalFood -= foodReduce;
                groupEnergy *= 1.10;
            }

        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!%n", groupEnergy);
    }
}
