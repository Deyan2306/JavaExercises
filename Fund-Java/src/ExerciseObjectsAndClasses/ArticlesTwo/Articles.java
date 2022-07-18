package ExerciseObjectsAndClasses.ArticlesTwo;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s%n", this.title, this.content, this.author);
    }
}
