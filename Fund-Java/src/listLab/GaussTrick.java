package listLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            inputList.add(Integer.parseInt(input[i]));
        }

        List<Integer> newList = new ArrayList<>();

        int i = 0;
        while (i < inputList.size() / 2) {
            int sum = inputList.get(i) + inputList.get(inputList.size() - 1 - i);
            newList.add(sum);
            i++;
        }
        if (inputList.size() % 2 != 0) {
            newList.add(inputList.get(inputList.size() / 2));
        }

        for (int j = 0; j < newList.size(); j++) {
            System.out.print(newList.get(j) + " ");
        }
    }
}
