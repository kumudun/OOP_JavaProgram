import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Book book1 = new Book("Java Basics", "James Gosling", "12345");
        Book book2 = new Book("OOP in Practice", "Alan Kay", "67890");
        Book book3 = new Book("Java'Unspeakable", "Ben Evans", "12345");


        LibraryMember member1 = new LibraryMember("Anne", 1);
        LibraryMember member2 = new LibraryMember("Charlie", 2);
        LibraryMember member3 = new LibraryMember("Daniel", 3);

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        // Borrow and return books
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book1);
        library.returnBook(member1, book1);
        library.borrowBook(member2, book1);
        library.borrowBook(member3, book2);
        library.returnBook(member2,book1);

    }
}

