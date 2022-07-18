package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] path = scanner.nextLine().split("\\\\");
        String[] full = path[path.length - 1].split("\\.");
        String name = full[0];
        String extention = full[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extention);
    }
}
