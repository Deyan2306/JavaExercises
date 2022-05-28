package dataTypesAndVariblesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        int people = numberOfPeople;
        while (people > 0){
            people -= capacity;
            courses += 1;
        }

        System.out.println(courses);
    }
}
