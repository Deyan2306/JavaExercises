package dataTypesAndVaribles;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMuch = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 1; i <= howMuch; i++) {
            int current = i;
            while (i > 0) {
                total += i % 10;
                i /= 10;
            }
            boolean isValid = (total == 5) || (total == 7) || (total == 11);

            if (isValid) {
                System.out.println(current + " -> True");
            } else {
                System.out.println(current + " -> False");
            }
            total = 0;
            i = current;
        }
    }
}
