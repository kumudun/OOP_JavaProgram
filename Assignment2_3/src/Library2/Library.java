package Library2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle()
                    + ", Author: " + book.getAuthor()
                    + ", Year: " + book.getYear());
        }
    }

    // Find books by a specific author
    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle()
                        + ", Year: " + book.getYear());
            }
        }
    }

    // Borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return;
            }
        }
    }

    // Return a book to the library
    public void returnBook(Book book) {
        books.add(book);
    }
}

