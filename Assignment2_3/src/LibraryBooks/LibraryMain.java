package LibraryBooks;

import java.util.ArrayList;

public class LibraryMain {
    public static void main(String[] args) {
        // 1. Create instances of Book
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        Book book4 = new Book("Advanced Java Concepts", "John Smith", 2021);

        // 2. Create an instance of Library
        Library library = new Library();

        // 3. Add the book instances to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // 4. Display the list of all books in the library
        library.displayBooks();

        // 5. Search for books by a specific author and display the results
        library.findBooksByAuthor("John Smith");  // Case-sensitive search
    }
}

