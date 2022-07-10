package labObjectsAndClasses.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String typeList = command.split("_")[0];
            String name = command.split("_")[1];
            String time = command.split("_")[2];

            Song currentSong = new Song(typeList, name, time);
            songs.add(currentSong);
        }

        String input = scanner.nextLine();

        if (input.equals("all")) {
            for (Song item : songs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songs) {
                if (item.getTypeList().equals(input)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
