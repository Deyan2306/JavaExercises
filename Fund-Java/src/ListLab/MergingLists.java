package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> sub = new ArrayList<>();

        int minimalSize = 0;
        if (firstList.size() > secondList.size()){
            minimalSize = secondList.size();
            sub = firstList.subList(minimalSize, firstList.size());
        } else {
            minimalSize = firstList.size();
            sub = secondList.subList(minimalSize, secondList.size());
        }

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < minimalSize; i++) {
            int firstEl = firstList.get(i);
            int secondEl = secondList.get(i);

            newList.add(firstEl);
            newList.add(secondEl);
        }

        for (int item : sub) {
            newList.add(item);
        }

        for (int i : newList){
            System.out.print(i + " ");
        }
    }
}
