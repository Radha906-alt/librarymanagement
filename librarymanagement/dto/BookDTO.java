package dto;

public class BookDTO {

    private int id;
    private String title;
    private String author;

    public BookDTO(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public BookDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
