package Library6;

import java.util.ArrayList;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Add a user to the library
    public void addUser(User user) {
        users.add(user);
    }

    // Borrow a book for a user
    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                user.borrowBook(book);
                break;
            }
        }
    }

    // Return a book from a user
    public void returnBook(Book book, User user) {
        books.add(book);
        user.returnBook(book);
    }

    // Check if a book is available
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Year: " + book.getPublicationYear() +
                    ", Rating: " + book.getRating() +
                    ", Reviews: " + book.getReviewCount());
        }
    }

    // Find books by a specific author
    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() +
                        ", Year: " + book.getPublicationYear());
            }
        }
    }

    // Get average book rating
    public double getAverageBookRating() {
        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }

    // Get the most reviewed book
    public Book getMostReviewedBook() {
        if (books.isEmpty()) return null;
        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviewCount() > mostReviewed.getReviewCount()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }
}
