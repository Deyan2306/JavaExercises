package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuffer(input).reverse().toString();

        System.out.println(reversed);
    }
}
