package methodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        printTriangle(num);
    }

    public static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            printLine(1, i);
        }

        for (int i = num - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine (int start, int end){
        for (int j = start; j <= end; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
