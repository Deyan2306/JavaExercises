package DataTypesAndVariblesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int startPower = power;
        int pokeCount = 0;
        while (power >= distance){
            power -= distance;
            pokeCount++;

            if (power == startPower * 0.5) {
                if (exhaustionFactor != 0){
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(pokeCount);
    }
}
