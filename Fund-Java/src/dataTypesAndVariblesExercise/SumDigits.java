package dataTypesAndVariblesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        //Sum
        int current = n;
        while (current > 0){
            int lastNum = current % 10;
            sum += lastNum;
            current /= 10;
        }

        System.out.println(sum);
    }
}
