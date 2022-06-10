package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double pow = Double.parseDouble(scanner.nextLine());
        double powered = powerIt(num, pow);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(powered));
    }

    public static double powerIt(double num, double pow) {
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }
}
