package system;



import model.Book;
import model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!book.isReserved() && !member.getBorrowedBooks().contains(book)) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else if (book.isReserved()) {
            System.out.println(book.getTitle() + " is reserved and cannot be borrowed.");
        } else {
            System.out.println(member.getName() + " already borrowed " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
        System.out.println(member.getName() + " returned " + book.getTitle());
    }

    // Reservation methods
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println(member.getName() + " reserved " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println(member.getName() + " canceled reservation for " + book.getTitle());
        } else {
            System.out.println(member.getName() + " did not reserve " + book.getTitle());
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

