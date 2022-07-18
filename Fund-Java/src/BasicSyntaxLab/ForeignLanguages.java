package BasicSyntaxLab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lang = scanner.nextLine();

        switch (lang) {
            case "England", "USA" -> System.out.println("English");
            case "Spain", "Argentina", "Mexico" -> System.out.println("Spanish");
            default -> System.out.println("unknown");
        }
    }
}
