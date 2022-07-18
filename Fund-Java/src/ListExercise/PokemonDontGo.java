package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pok = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!pok.isEmpty()) {
            int ind = Integer.parseInt(scanner.nextLine());

            if (ind >= 0 && ind <= pok.size() - 1) {
                int element = pok.get(ind);
                sum += element;
                pok.remove(ind);
                changeListContent(pok, element);
            } else if (ind < 0) {
                int element = pok.get(0);
                sum += element;
                pok.set(0, pok.get(pok.size()-1));
                changeListContent(pok, element);
            } else {
                int element = pok.get(pok.size()-1);
                sum += element;
                pok.set((pok.size()-1), pok.get(0));
                changeListContent(pok, element);
            }
        }
        System.out.println(sum);
    }

    static void changeListContent(List<Integer> numbersList, int element) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) <= element){
                numbersList.set(i, numbersList.get(i) + element);
            } else {
                numbersList.set(i, numbersList.get(i) - element);
            }
        }
    }
}
