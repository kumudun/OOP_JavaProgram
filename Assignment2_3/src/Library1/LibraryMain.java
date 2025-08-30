package Library1;

public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("Head First Java", "Kathy Sierra & Bert Bates", 2003);
        Book b2 = new Book("Thinking in Java", "Bruce Eckel", 1998);
        Book b3 = new Book("Effective Java", "Joshua Bloch", 2001);
        Book b4 = new Book("Advanced Java Concepts", "John Smith", 2021);
        Book b5 = new Book("Java Concurrency in Practice","Brian Goetz",2006);

        // Create library
        Library library = new Library();

        // Add books to library
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);

        // Display all books
        library.displayBooks();

        // Search for books by author
        System.out.println();
        library.findBooksByAuthor("Joshua Bloch");
    }
}
