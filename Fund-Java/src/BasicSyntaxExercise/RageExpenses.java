package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double monitorPrice = Double.parseDouble(scanner.nextLine());

        int headsetNum = gamesLost / 2;
        int mouseNum = gamesLost / 3;
        int keyboardNum = gamesLost / 6;
        int monitorNum = gamesLost / 12;

        double totalSum = (headsetNum * headsetPrice)
                + (monitorNum * monitorPrice)
                + (mouseNum * mousePrice)
                + (keyboardNum * keyboardPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
