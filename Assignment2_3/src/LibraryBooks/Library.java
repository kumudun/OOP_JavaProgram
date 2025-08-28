package LibraryBooks;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int count = 1;
        for (Book book : books) {
            System.out.println(count + ". Title: \"" + book.getTitle()
                    + "\", Author: \"" + book.getAuthor()
                    + "\", Year: " + book.getPublicationYear());
            count++;
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {  // case-sensitive match
                System.out.println("Title: \"" + book.getTitle()
                        + "\", Year: " + book.getPublicationYear());
            }
        }
    }
}
