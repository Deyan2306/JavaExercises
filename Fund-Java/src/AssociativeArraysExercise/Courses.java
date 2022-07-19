package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String course = data[0];
            String student = data[1];
            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
                courses.get(course).add(student);
            } else {
                courses.get(course).add(student);
            }
            input = scanner.nextLine();
        }
        courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));
                    e.getValue().stream().forEach(p -> System.out.println(String.format("-- %s",p)));
                });
    }
}
