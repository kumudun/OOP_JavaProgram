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


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);


        library.borrowBook(member1, book1);
        library.borrowBook(member2, book1); // Should show reserved/unavailable

        // Reserve books
        library.reserveBook(member2, book2);
        library.reserveBook(member1, book2); // Already reserved

        // Display reservations
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        // Cancel reservation
        library.cancelReservation(member2, book2);
        library.displayReservedBooks(member2);

        // Borrow after cancellation
        library.borrowBook(member1, book2);
    }
}

