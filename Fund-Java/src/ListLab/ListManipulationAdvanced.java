package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());;
        String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("Contains")){
                int number = Integer.parseInt(input.split(" ")[1]);
                boolean hasTheNum = numbers.contains(number);

                if (hasTheNum){
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (input.contains("Print even")){
                List<Integer> evenNums = new ArrayList<>();
                for (int i : numbers){
                    if (i % 2 == 0){
                        evenNums.add(i);
                    }
                }

                for (int i : evenNums){
                    System.out.print(i + " ");
                }
                System.out.println();
            } else if (input.contains("Print odd")) {
                List<Integer> oddNums = new ArrayList<>();
                for (int i : numbers){
                    if (i % 2 != 0){
                        oddNums.add(i);
                    }
                }

                for (int i : oddNums){
                    System.out.print(i + " ");
                }
                System.out.println();
            } else if (input.contains("Get sum")){
                int sum = 0;
                for (int i : numbers){
                    sum += i;
                }
                System.out.println(sum);
            } else if (input.contains("Filter")){
                String filtOperator = input.split(" ")[1];
                int num = Integer.parseInt(input.split(" ")[2]);

                switch (filtOperator) {
                    case "<":
                        List<Integer> result = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < num) {
                                result.add(numbers.get(i));
                            }
                        }
                        for (int i : result) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                        break;
                    case ">":
                        List<Integer> results = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > num) {
                                results.add(numbers.get(i));
                            }
                        }
                        for (int i : results) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                        break;
                    case "<=":
                        List<Integer> Result = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= num) {
                                Result.add(numbers.get(i));
                            }
                        }
                        for (int i : Result) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                        break;
                    case ">=":
                        List<Integer> resulT = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= num) {
                                resulT.add(numbers.get(i));
                            }
                        }
                        for (int i : resulT) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                        break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
