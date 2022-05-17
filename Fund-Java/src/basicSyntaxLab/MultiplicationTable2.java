package basicSyntaxLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multip = Integer.parseInt(scanner.nextLine());
        if (multip <= 10){
            for (int i = multip; i <= 10; i++) {
                int mult = num * i;
                System.out.printf("%d X %d = %d%n", num, i, mult);
            }
        } else {
            int mult = num * multip;
            System.out.printf("%d X %d = %d%n", num, multip, mult);
        }
    }
}
