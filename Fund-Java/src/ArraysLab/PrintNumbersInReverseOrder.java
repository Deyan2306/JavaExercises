package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrNums = new int[n];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = arrNums.length - 1; i >= 0; i--) {
            System.out.print(arrNums[i] + " ");
        }
    }
}
