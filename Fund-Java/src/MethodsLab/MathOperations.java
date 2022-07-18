package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNum = Integer.parseInt(scanner.nextLine());
        double result = charOperate(firstNum, operator, secondNum);
        System.out.printf("%.0f", result);

    }

    public static double charOperate(double firstNumber, char operator, double secondNumber){
        double result = 0;
        switch (operator){
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}
