package ListLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < integerList.size() - 1; i++) {
            double currentNum = integerList.get(i);
            double nextNum = integerList.get(i + 1);

            if (currentNum == nextNum){
                integerList.set(i, currentNum + nextNum);
                integerList.remove(i + 1);

                i = -1;
            }
        }

        String output = joinByDelimiter(integerList, " ");
        System.out.println(output);

    }

    public static String joinByDelimiter(List<Double> items, String delimiter){
        String output = "";
        for (Double item : items){
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
