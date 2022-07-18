package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actionInput = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (actionInput){
            case "add":
                addNum(firstNum, secondNum);
                break;
            case "multiply":
                multiplyNum(firstNum, secondNum);
                break;
            case "subtract":
                subtractNum(firstNum, secondNum);
                break;
            case "divide":
                divideNum(firstNum, secondNum);
                break;
        }
    }

    public static void addNum(int first, int second){
        int result = first + second;
        System.out.println(result);
    }

    public static void multiplyNum(int first, int second){
        int result = first * second;
        System.out.println(result);
    }

    public static void subtractNum(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void divideNum(int first, int second) {
        int result = first / second;
        System.out.println(result);
    }
}
