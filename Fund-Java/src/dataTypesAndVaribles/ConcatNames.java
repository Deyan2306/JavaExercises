package dataTypesAndVaribles;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String limiter = scanner.nextLine();

        System.out.println(firstName + limiter + lastName);
    }
}
