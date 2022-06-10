package methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type){
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numOne, numTwo));
                break;
            case "char":
                char charOne = scanner.nextLine().charAt(0);
                char charTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(charOne, charTwo));
                break;
            case "string":
                String one = scanner.nextLine();
                String two = scanner.nextLine();
                System.out.println(getMax(one, two));
                break;
        }

    }
    public static int getMax (int one, int two) {
        if (one > two) {
            return one;
        } else {
            return two;
        }
    }

    public static char getMax (char one, char two){
        if (one > two) {
            return one;
        } else {
            return two;
        }
    }

    public static String getMax (String one, String two){
        String result = "";
        if (one.compareTo(two) > 0){
            result = one;
        } else {
            result = two;
        }

        return result;
    }
}
