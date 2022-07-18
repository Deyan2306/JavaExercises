package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        String result = repeatDaString(textInput, repeat);
        System.out.println(result);
    }

    public static String repeatDaString (String repeatableString, int rotations){
        String result = "";
        for (int i = 0; i < rotations; i++) {
            result += repeatableString;
        }
        return result;
    }
}
