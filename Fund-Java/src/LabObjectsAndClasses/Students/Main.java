package LabObjectsAndClasses.Students;

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

            if (doesExist(students, firstName, lastName)) {
                Student currentStudent = getStudent(students, firstName, lastName);

                currentStudent.setFirstName(firstName);
                currentStudent.setLastName(lastName);
                currentStudent.setAge(age);
                currentStudent.setHomeTown(town);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, town);
                students.add(currentStudent);
            }
            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student item : students) {
            if (item.getHomeTown().equals(town)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }

    private static boolean doesExist (List<Student> students, String firstName, String lastName) {
        for (Student item : students) {
            if(item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent (List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student item : students) {
            if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                existingStudent = item;
            }
        }
        return existingStudent;
    }
}
