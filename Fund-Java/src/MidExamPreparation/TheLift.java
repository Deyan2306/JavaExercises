package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long peopleWaitingForLyft = Long.parseLong(scanner.nextLine());
        long[] wagon = Arrays.stream(scanner.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        long peopleOnTheCurrentWagon = 0;
        long peopleonTheLyft = 0;
        boolean NoMorePeople = false;

        for (int i = 0; i < wagon.length; i++) {
            while (wagon[i] < 4) {
                wagon[i]++;
                peopleOnTheCurrentWagon++;
                if (peopleonTheLyft + peopleOnTheCurrentWagon == peopleWaitingForLyft) {
                    NoMorePeople = true;
                    break;
                }
            }
            peopleonTheLyft += peopleOnTheCurrentWagon;
            if (NoMorePeople) {
                break;
            }
            peopleOnTheCurrentWagon = 0;
        }

        if (peopleWaitingForLyft > peopleonTheLyft) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaitingForLyft - peopleonTheLyft);
            for (long i : wagon) {
                System.out.print(i + " ");
            }
        } else if (peopleonTheLyft < wagon.length * 4){
            System.out.println("The lift has empty spots!");
            for (long i : wagon) {
                System.out.print(i + " ");
            }
        } else if (peopleonTheLyft == wagon.length * 4){
            for (long i : wagon) {
                System.out.print(i + " ");
            }
        }
    }
}
