package ExerciseObjectsAndClasses.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine();
        String[] parts = article.split(", ");
        String title = parts[0];
        String content = parts[1];
        String author = parts[2];

        Article article1 = new Article(title, content, author);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfCommands; i++) {
            String command = scanner.nextLine();
            String word = command.split("\\: ")[0];
            String newContent = command.split("\\: ")[1];

            switch (word) {
                case "Edit":
                    article1.Edit(newContent);
                    break;
                case "ChangeAuthor":
                    article1.ChangeAuthor(newContent);
                    break;
                case "Rename":
                    article1.Rename(newContent);
                    break;
            }
        }

        String result = article1.toString();
        System.out.println(result);
    }
}
