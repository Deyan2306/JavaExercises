package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!validateLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!validateContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!validateNums(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (validateLength(password) && validateNums(password) && validateContent(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean validateLength (String pass) {
        if (pass.length() >= 6 && pass.length() <= 10){
            return true;
        } else {
            return false;
        }
            //return pass.length() >= 6 && pass.length() <= 10;
    }

    private static boolean validateContent (String pass) {
        for (char numsOrText : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(numsOrText)){
                return false;
            }
        }
        //Valid content
        return true;
    }

    private static boolean validateNums (String pass) {
        int countDigits = 0;
        for (char digit : pass.toCharArray()){
            if (Character.isDigit(digit)){
                countDigits++;
            }
        }

        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }

        //return countDigits >= 2;
    }
}
