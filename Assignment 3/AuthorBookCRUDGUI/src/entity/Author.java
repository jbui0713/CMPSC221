package entity;

/**
 *
 * @author jjb6569
 */
public class Author
{ // Class Author created
    private int authorID; // ID of author
    private String firstName; // First name of author
    private String lastName; // Last name of author
    
    public Author(int authorID, String firstName, String lastName)
    { // Constuctor created for author
        this.authorID = authorID; // Returns author id 
        this.firstName = firstName; // Returns first name
        this.lastName = lastName; // Returns last name
    }

    public int getAuthorID() { // Gets author id
        return authorID;
    }

    public String getFirstName() { // Gets first name
        return firstName;
    }

    public String getLastName() { // Gets last name
        return lastName;
    }


    @Override
    public String toString() { // Returns unique identifer of object as a string
        return "Author{" + "authorID=" + authorID + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
}
