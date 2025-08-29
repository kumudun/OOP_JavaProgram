package LibraryBooks;
import java.util.ArrayList;



public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0.0;
        this.reviews =  new ArrayList<>();;
    }



    // set rating
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        }
    }

    // Add review
    public void addReview(String review) {
        reviews.add(review);
    }



    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    // Getter for rating
    public double getRating() {
        return rating;
    }

    // Getter review
    public ArrayList<String> getReviews() {
        return reviews;
    }



    public void printBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publicationYear + ", Rating: " + rating + ", Reviews: " + reviews);
    }
}





