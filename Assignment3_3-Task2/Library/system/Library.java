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
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not in library: " + book.getTitle());
            return;
        }

        if (member.getBorrowedBooks().contains(book)) {
            System.out.println(member.getName() + " already borrowed this book: " + book.getTitle());
            return;
        }

        boolean available = true;
        for (LibraryMember m : members) {
            if (m.getBorrowedBooks().contains(book)) {
                available = false;
                break;
            }
        }

        if (available) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed book: " + book.getTitle());
        } else {
            System.out.println("Book unavailable: " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            System.out.println(member.getName() + " returned book: " + book.getTitle());
        } else {
            System.out.println(member.getName() + " did not borrow book: " + book.getTitle());
        }
    }
}

