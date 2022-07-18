package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        List<Character> field = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            char symbol = name.charAt(i);
            field.add(symbol);

            if (symbol == '>') {
                i++;
                int bomb = name.charAt(i) - '0';

                int j = i;
                for (; j < i + bomb && j < name.length(); j++) {
                    if (name.charAt(j) == '>') {
                        field.add('>');
                        j++;
                        bomb += (name.charAt(j) - '0') + 1;
                    }
                }

                i = j - 1;
            }
        }

        for (int i = 0; i < field.size() ; i++) {
            System.out.print(field.get(i));
        }
    }
}
