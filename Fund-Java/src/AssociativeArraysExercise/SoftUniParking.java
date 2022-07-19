package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> parking = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];

            switch (command) {
                case "register":
                    String username = input.split("\\s+")[1];
                    String licensePlateNumber = input.split("\\s+")[2];

                    if (parking.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parking.get(username));
                        break;
                    }

                    parking.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    break;
                case "unregister":
                    String user = input.split("\\s+")[1];

                    if (!parking.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found%n", user);
                        break;
                    }
                    parking.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                    break;
            }
        }

        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
