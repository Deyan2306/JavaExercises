package basicSyntaxExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = "";
        String input = scanner.nextLine();
        int counter = 0;
        int possitions = login.length() - 1;
        boolean isNotValid = false;

        for (int i = possitions; i >= 0; i--){
            char current = login.charAt(i);
            password += current;
        }

        while (!input.equals(password)){
            counter++;
            if (counter == 4){
                System.out.printf("User %s blocked!", login);
                isNotValid = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (!isNotValid){
            System.out.printf("User %s logged in.", login);
        }
    }
}
