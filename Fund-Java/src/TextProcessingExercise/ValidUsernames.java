package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        List<String> validUsernames = new ArrayList<>();

        for (String currentUsername : usernames) {
            if (isValidated(currentUsername)) {
                validUsernames.add(currentUsername);
            }
        }

        for (String valid : validUsernames) {
            System.out.println(valid);
        }
    }

    private static boolean isValidated(String currentUsername) {

        if (currentUsername.length() < 3 || currentUsername.length() > 16) {
            return false;
        }

        for (char current : currentUsername.toCharArray()) {
            if (!Character.isLetterOrDigit(current) && current != '_' && current != '-') {
                return false;
            }
        }

        return true;
    }
}