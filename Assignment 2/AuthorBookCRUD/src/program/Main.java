package program;

import entity.*;
import java.util.Scanner;
import java.util.List;
import java.util.Optional;



public class Main { // Class Main created

    private static DAO authorDAO; // DAO of author
    private static DAO bookDAO; // DAO of book
    private static int table; // Table option for author and book
    private static int option; // Option choices for CRUD
    private static int authorID; // Author's ID
    private static String firstName; // Author's first name
    private static String lastName; // Author's last name
    private static int isbn; // ISBN of book
    private static String title; // Title of book
    
    public static void main(String[] args) {
        while (true) { //Loops the program until user wants to exit 
        Scanner scan = new Scanner(System.in); // Scanner instance created for user input for table seletion
        Scanner newinfo = new Scanner(System.in); // Scanner instance created for user iput for options of CRUD
        authorDAO = new AuthorDAO(); // New author instance created 
        Author author; // Creates author object 
        bookDAO = new BookDAO(); // New book instance created 
        Book book; // Creates book object
        displayMenu(scan);
        /***************
        This is old format for program
        System.out.println("-----------------------------------------------------------------------------------------------");
        printBooks(); // Prints book table
        printAuthors(); // Prints author table*/
        System.out.println("Enter Author(0), Book(1), or All Options(2) for table options: "); // Prints message for table seletion
        table = scan.nextInt(); // Scans user input for table
        switch (table) { // Tests user input against case option for table given
            case 0: // Case 0 prints options for Author table
                System.out.println("Select from Options 1-4\nCreate Author(1) | Return Author(2) | Update Author(3) | Delete Author(4) | Exit Program (9): ");
                break; // Breaks programs
            case 1: // Case 1 prints options for Book table options
                System.out.println("Select from Options 5-8\nCreate Book(5) | Return Book(6) | Update Book(7) | Delete Book(8) | Exit Program (9): ");
                break;// Breaks program
            case 2:// Case 2 pints all options for both tables
                System.out.println("Select from Options 1-4\nCreate Author(1) | Return Author(2) | Update Author(3) | Delete Author(4)"
                        + "\nOptions 5-8\nCreate Book(5) | Return Book(6) | Update Book(7) | Delete Book(8) | Exit Program (9)");
                break; // Breaks program
            default: // Default case exits program
                System.out.println("Invalid input, try again");
                //System.exit(0); // Exits the program
        }
            option = scan.nextInt(); // Scans user input for options.
            
            switch (option) { // Tests user input against case options for option within tables
                case 1: // Case 1 adds author into author table
                    System.out.println("Enter new author First Name: "); // Asks user for author first name
                    firstName = newinfo.nextLine(); // Scans user input 
                    System.out.println("Enter new author Last Name: "); // Asks user for author last name
                    lastName = newinfo.nextLine(); // Scans user input 
                    System.out.println("Enter new author ID: "); // Asks user for author id
                    authorID = newinfo.nextInt(); // Scans user input
                    addAuthor(authorID,firstName,lastName); // Runs addAuthor method with the scan inputs 
                    printAuthors(); // Prints author table to se update
                    break; // Breaks program
                case 2: // Case 2 reads author information after getting it's id
                    System.out.println("Enter Author ID for information: "); // Asks user for author id to search
                    authorID = newinfo.nextInt(); // Scans user input 
                    author = getAuthor(authorID); // Runs the getAuthor method with scan input
                    System.out.println(author); // Prints out author information
                    break; // Breaks program
                case 3: // Case 3 updates author information 
                    System.out.println("Enter new author First Name: "); // Asks user for autho first name
                    firstName = newinfo.nextLine(); // Scans input 
                    System.out.println("Enter new author Last Name: "); // Asks user for author last name
                    lastName = newinfo.nextLine(); // Scans input 
                    System.out.println("Enter new author ID: "); // Asks user for author id 
                    authorID = newinfo.nextInt(); // Scans input 
                    updateAuthor(authorID,firstName,lastName); // Runs updateAuthor method with scan inputs 
                    printAuthors(); // Prints author table
                    break; // Breaks program
                case 4: // Case 4 deletes author from author database
                    System.out.println("Author must not have existing book in records to delete author."); // Informs user that author can only be deleted if no books exist under them
                    System.out.println("Information in database below."); // Prints the databases for user to see if delete is possible
                    printAuthors(); // Prints author table 
                    printBooks(); // Prints book table
                    System.out.println("Enter Author ID to Delete: "); // Ask user for author id
                    authorID = newinfo.nextInt(); // Scans input
                    deleteAuthor(authorID); // Runs detele author method with scan inputs
                    printAuthors(); // Prints the author table for the update 
                    break; // Breaks the program
                case 5: // Case 5 adds book into bookt table
                    System.out.println("Enter new book Title: "); // Asks user for book title
                    title = newinfo.nextLine(); // Scans input 
                    System.out.println("Enter new book ISBN: "); // Asks user for book isbn
                    isbn = newinfo.nextInt(); // Scans input 
                    System.out.println("Enter new author ID: "); // Asks user for author id 
                    authorID = newinfo.nextInt(); // Scans input 
                    addBook(isbn,title,authorID); // Runs addBook method with scan inputs 
                    printBooks(); // Prints book table 
                    break; // Breaks program
                case 6: // Case 6 reads book information after getting isbn
                    System.out.println("Enter Book ISBN for information: "); // Asks user for book isbn
                    isbn = newinfo.nextInt(); // Scans input 
                    book = getBook(isbn); // Runs getBook method with scan input 
                    System.out.println(book); // Prints book information
                    break; // Breaks program
                case 7: // Case 7 updates book information 
                    System.out.println("Enter new book Title: "); // Asks user for book title 
                    title = newinfo.nextLine(); // Scans input 
                    System.out.println("Enter new book ISBN: "); // Asks user for book isbn 
                    isbn = newinfo.nextInt(); // Scans input 
                    System.out.println("Enter new author ID: "); // Asks user for author id 
                    authorID = newinfo.nextInt(); // Scans input 
                    updateBook(isbn,title,authorID); // Runs updateBook method with scan inputs 
                    printBooks(); // Prints book table 
                    break; // Breaks program
                case 8: // Case 8 deletes book from book table 
                    System.out.println("Enter Book ISBN for information: "); // Asks user for bok isbn 
                    isbn = newinfo.nextInt(); // Scans input 
                    deleteBook(isbn); // Runs deleteBook method 
                    printBooks(); // Prints book table 
                    break; // Breaks program 
                case 9: // Case 9 exits the program
                    System.out.println("Exiting program");
                    //break; // Breaks program 
                    System.exit(0);
                default:
                    System.out.println("Invalid input, try again");
                    break;
                    
            }
        }      
        
    }
    
    static void addAuthor(int authorID, String firstName, String lastName) { // Method adds author into author table
        Author author; // Creates author object
        author = new Author(authorID, firstName, lastName); // Creates author instance
        authorDAO.insert(author); // Runs insert method from AuthorDAO
    }
    
    static Author getAuthor(int authorID) { // Method gets author from author table
        Optional<Author> author = authorDAO.get(authorID); // Creates author instance 
        return author.orElseGet(() -> new Author(-1, "Non-exist", "Non-exist")); // Returns default values if not in author table
    }
    
    
    static void updateAuthor(int authorID, String firstName, String lastName) { // Method updates author in author table 
        Author author; // Creates author object 
        author = new Author (authorID, firstName, lastName); // Creates author instance 
        authorDAO.update(author); // Runs update method from AuthorDAO
    }
    
    static void deleteAuthor(int authorID) { // Method deletes author from author table 
            Author author; // Creates author object 
            author = getAuthor(authorID); // Runs getAuthor method 
            authorDAO.delete(author); // Runs delete method from AuthorDAO
    }
    
    static void printAuthors() { // Method prints author table 
        List<String> headers = authorDAO.getColumnNames();
        int numberCols = headers.size();
        //Print column names as header
        for (int i = 0; i < numberCols; i++) {
            String header = headers.get(i);
            System.out.printf("%25s", header);
        }
        System.out.println();
        //Print the results
        List<Author> authors = authorDAO.getAll();
        int numberRows = authors.size();
        for (int i = 0; i < numberRows; i++) {
            System.out.printf("%25s%25s%25s", authors.get(i).getAuthorID(), authors.get(i).getFirstName(), authors.get(i).getLastName());
            System.out.println();
        }
        
    }
    static void addBook(int isbn, String title, int authorID) { // Method adds book into book table
        Book book; // Creates book object
        book = new Book(isbn, title, authorID); // Creates book instance 
        bookDAO.insert(book); // Runs insert method from BookDAO
    }
    
    static Book getBook(int isbn) { // Method gets isbn from book table
        Optional<Book> book = bookDAO.get(isbn); // Creates book instance
        return book.orElseGet(() -> new Book(-1, "Non-exist", -1)); // Returns default values if not in book table
    }
    
    static void updateBook(int isbn, String title, int authorID) { // Method updates book in book table
        Book book; // Creates book object
        book = new Book(isbn, title, authorID); // Creates book instance
        bookDAO.update(book); // Runs update method from BookDAO
    }
    
    static void deleteBook(int isbn) { // Method deletes book from book table 
        Book book; // Creates book object
        book = getBook(isbn); // Runs getBook method 
        bookDAO.delete(book); // Runs delete method from BookDAO
    }
    
    static void printBooks() { // Method prints book table 
        List<String> headers = bookDAO.getColumnNames();
        int numberCols = headers.size();
        //Print column names as header
        for (int i = 0; i < numberCols; i++) {
            String header = headers.get(i);
            System.out.printf("%25s", header);
        }
        System.out.println();
        //Print the results
        List<Book> books = bookDAO.getAll();
        int numberRows = books.size();
        for (int i = 0; i < numberRows; i++) {
            System.out.printf("%25s%25s%25s", books.get(i).getISBN(), books.get(i).getTitle(), books.get(i).getAuthorID());
            System.out.println();
        }
        
    }
    static void displayMenu(Scanner scan) {
        System.out.println("Enter Author(0), Book(1), All Options(2) for table options, or (3) to exit program "); // Prints message for table selection
        try {
            table = scan.nextInt(); // Scans user input for table
        switch (table) { // Tests user input against case option for table given
            case 0: // Case 0 prints options for Author table
                System.out.println("Select from Options 1-4\nCreate Author(1) | Return Author(2) | Update Author(3) | Delete Author(4) | Exit Program (9): ");
                break; // Breaks programs
            case 1: // Case 1 prints options for Book table options
                System.out.println("Select from Options 5-8\nCreate Book(5) | Return Book(6) | Update Book(7) | Delete Book(8) | Exit Program (9): ");
                break;// Breaks program
            case 2:// Case 2 pints all options for both tables
                System.out.println("Select from Options 1-4\nCreate Author(1) | Return Author(2) | Update Author(3) | Delete Author(4)"
                        + "\nOptions 5-8\nCreate Book(5) | Return Book(6) | Update Book(7) | Delete Book(8) | Exit Program (9)");
                break; // Breaks program
            default: // Default case exits program
                System.out.println("Invalid input, try again");
                //System.exit(0); // Exits the program
        }
    } catch (Exception e) {
        System.out.println("Invalid input, try again");
        scan.nextLine();
        displayMenu(scan);
        }
    }
}