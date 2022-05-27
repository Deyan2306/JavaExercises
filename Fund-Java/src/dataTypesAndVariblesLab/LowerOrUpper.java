package dataTypesAndVariblesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);

        if (input >= 'a' && input <= 'z') {
            System.out.println("lower-case");
        } else if (input >= 'A' && input <= 'Z') {
            System.out.println("upper-case");
        }
    }
}
