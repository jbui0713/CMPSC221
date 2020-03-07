package entity;

/**
 *
 * @author jjb6569
 */
public class Book
{ // Class Book created
    private int isbn; // ISBN of book
    private String title; // Title of book
    private int authorID; // Last name of contact
    
    public Book(int isbn, String title, int authorID)
    { // Constuctor created for book
        this.isbn = isbn; // Returns ISBN 
        this.title = title; // Returns first name
        this.authorID = authorID; // Returns last name
    }

    public int getISBN() { // Gets ISBN
        return isbn;
    }

    public String getTitle() { // Gets title
        return title;
    }

    public int getAuthorID() { // Gets author id
        return authorID;
    }


    @Override
    public String toString() { // returns unique identifer of object as a string
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", authorID=" + authorID + '}';
    }
}
