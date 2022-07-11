package exerciseObjectsAndClasses.ArticlesTwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Articles> articleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String article = scanner.nextLine();
            String[] parts = article.split(", ");
            String title = parts[0];
            String content = parts[1];
            String author = parts[2];

            Articles currentArticle = new Articles(title, content, author);
            articleList.add(currentArticle);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "title":
                articleList.sort(Comparator.comparing(Articles::getTitle).reversed());
                break;
            case "content":
                articleList.sort(Comparator.comparing(Articles::getContent).reversed());
                break;
            case "author":
                articleList.sort(Comparator.comparing(Articles::getAuthor).reversed());
                break;
        }

        for (Articles current : articleList) {
            String result = current.toString();
            System.out.println(result);
        }
    }
}
