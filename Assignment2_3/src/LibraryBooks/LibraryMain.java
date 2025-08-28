package LibraryBooks;

public class LibraryMain {
    public static void main(String[] args) {



        //  Create instances of Book
        Book book1 = new Book("Head First Java", "Kathy Sierra & Bert Bates", 2003);
        Book book2 = new Book("Thinking in Java", "Bruce Eckel", 1998);
        Book book3 = new Book("Effective Java", "Joshua Bloch", 2001);
        Book book4 = new Book("Advanced Java Concepts", "John Smith", 2021);
        Book book  = new Book("Java Concurrency in Practice","Brian Goetz",2006);

        // Create an instance of Library
        Library library = new Library();

        //  Add the book instances to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Display the list of all books in the library
        library.displayBooks();

        // Search for books by a specific author and display
        library.findBooksByAuthor("Joshua Bloch");
    }
}

