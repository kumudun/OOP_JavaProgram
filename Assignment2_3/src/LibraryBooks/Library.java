package LibraryBooks;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getPublicationYear() + ", Rating: " + book.getRating() + ", Reviews: " + book.getReviewCount());


        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() + ", Year: " + book.getPublicationYear());

            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                break;
            }
        }
    }

    public void returnBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }

    public Book getMostReviewedBook() {
        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviewCount() > mostReviewed.getReviewCount()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }










}


