package methodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        resultAll(firstNum, secondNum, thirdNum);

    }

    private static void resultAll (int first, int second, int third) {
        int sum = sumFirstTwo(first, second);
        int subtracted = subtractThird(sum, third);
        System.out.println(subtracted);
    }

    private static int sumFirstTwo (int first, int second) {
        return first + second;
    }

    private static int subtractThird (int sum, int third) {
        return sum - third;
    }
}
