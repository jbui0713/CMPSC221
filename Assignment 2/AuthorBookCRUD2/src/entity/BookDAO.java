package entity;

import core.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jjb6569
 */
public class BookDAO implements DAO<Book>{
    public BookDAO() {
        // Constuctor created named BookDAO
    }
    List<Book> books; // Book table 
    /**
     * Get a single book entity as a book object
     * @param isbn
     * @return 
     */
    @Override
    public Optional<Book> get(int isbn) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try { // Tries the code below
            String sql = "SELECT * FROM Book WHERE isbn = ?"; // Need this sql query to get the isbn
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, isbn);
            rs = stmt.executeQuery();
            Book book = null;
            while (rs.next()) {
                book = new Book(rs.getInt("isbn"), rs.getString("title"), rs.getInt("authorID"));
            }
            return Optional.ofNullable(book);
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all book entities as a List
     * @return 
     */
    @Override
    public List<Book> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        books = new ArrayList<>(); // Creates book as an array
        try { // Tries the code below
            String sql = "SELECT * FROM Book";
            rs = db.executeQuery(sql);
            Book book = null;
            while (rs.next()) {
                book = new Book(rs.getInt("isbn"), rs.getString("title"), rs.getInt("authorID"));
                books.add(book); // Adds books to a list
            }
            return books; // Returns the book list
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert a book object into book table
     * @param book 
     */
    @Override
    public void insert(Book book)
    {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "INSERT INTO Book(isbn, title, authorID) VALUES (?, ?, ?)"; // Enters the inputs to add book into table
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, book.getISBN());
            stmt.setString(2, book.getTitle());
            stmt.setInt(3, book.getAuthorID());
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) { // Checks ti see if anything was inserted
                System.out.println("A new book was inserted successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try an prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a book entity in database if it exists using a book object
     * @param book
     */
    @Override
    public void update(Book book) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "UPDATE Book SET title=?, authorID=? WHERE isbn=?"; // Searches for isbn to update any changes
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, book.getTitle());
            stmt.setInt(2, book.getAuthorID());
            stmt.setInt(3, book.getISBN());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing book was updated successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a book from book table if the entity exists
     * @param book 
     */
    @Override
    public void delete(Book book) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "DELETE FROM Book WHERE isbn = ?"; // Deletes book based on isbn searched
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, book.getISBN());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A book was deleted successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Get all column names in a list array
     * @return 
     */
    @Override
    public List<String> getColumnNames() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        List<String> headers = new ArrayList<>();
        try { // Tries the code below
            String sql = "SELECT * FROM Book WHERE isbn = -1";//We just need this sql query to get the column headers
            rs = db.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            //Get number of columns in the result set
            int numberCols = rsmd.getColumnCount();
            for (int i = 1; i <= numberCols; i++) {
                headers.add(rsmd.getColumnLabel(i));//Add column headers to the list
            }
            return headers;
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        } 
    }
}
