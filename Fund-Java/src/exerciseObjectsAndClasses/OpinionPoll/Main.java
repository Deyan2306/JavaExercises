package exerciseObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            Person currentPerson = new Person(name, age);
            peopleList.add(currentPerson);
        }

        for (Person current : peopleList) {
            if (current.getAge() > 30) {
                String toPrint = current.toString();
                System.out.println(toPrint);
            }
        }
    }
}
