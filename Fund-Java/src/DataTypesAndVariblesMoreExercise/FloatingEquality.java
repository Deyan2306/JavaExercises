package DataTypesAndVariblesMoreExercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal NumOne = new BigDecimal(scanner.nextLine()).setScale(6, RoundingMode.DOWN);
        BigDecimal NumTwo = new BigDecimal(scanner.nextLine()).setScale(6, RoundingMode.DOWN);

        if (NumOne.equals(NumTwo)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
