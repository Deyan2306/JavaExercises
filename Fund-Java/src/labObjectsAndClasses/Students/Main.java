package labObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] split = input.split("\\s+");
            String firstName = split[0];
            String lastName = split[1];
            String age = split[2];
            String town = split[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            students.add(currentStudent);
            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student item : students) {
            if (item.getHomeTown().equals(town)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
