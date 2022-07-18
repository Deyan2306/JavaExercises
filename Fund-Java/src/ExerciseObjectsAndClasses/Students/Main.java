package ExerciseObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student currentStudent = new Student(firstName, lastName, grade);
            studentList.add(currentStudent);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student currentItem : studentList) {
            System.out.printf("%s %s: %.2f%n",
                    currentItem.getFirstName(),
                    currentItem.getFirstName(),
                    currentItem.getGrade());
        }
    }
}
