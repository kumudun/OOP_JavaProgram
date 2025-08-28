package LibraryBooks;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    // Optional: method to print book details
    public void printBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publicationYear);
    }
}
