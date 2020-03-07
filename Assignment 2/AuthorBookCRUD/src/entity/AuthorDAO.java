package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import core.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author jjb6569
 */
public class AuthorDAO implements DAO<Author>
{   
    public AuthorDAO() {
        // Constuctor created named AuthorDAO
    }
    List<Author> authors; // Author table 
    /**
     * Get a single author entity as an author object
     * @param authorID
     * @return 
     */
    @Override
    public Optional<Author> get(int authorID) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try { // Tries the code below
            String sql = "SELECT * FROM Author WHERE authorID = ?"; // Need this sql query to get the author id
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, authorID);
            rs = stmt.executeQuery();
            Author author = null;
            while (rs.next()) {
                author = new Author(rs.getInt("authorID"), rs.getString("firstName"), rs.getString("lastName"));
            } 
            return Optional.ofNullable(author);
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all author entities as a List
     * @return 
     */
    @Override
    public List<Author> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        authors = new ArrayList<>(); // Creates authors as an array
        try { // Tries the code below
            String sql = "SELECT * FROM Author ORDER BY authorID"; // Need this sql query to get the author id and orders it numerically 
            rs = db.executeQuery(sql);
            Author author = null;
            while (rs.next()) {
                author = new Author(rs.getInt("authorID"), rs.getString("firstname"), rs.getString("lastName"));
                authors.add(author); // Adds authors to a list
            }
            return authors; // Returns the author list
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert an author object into author table
     * @param author 
     */
    @Override
    public void insert(Author author)
    {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "INSERT INTO Author(authorID, firstName, lastName) VALUES (?, ?, ?)"; // Enters the inputs to add author into table
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, author.getAuthorID());
            stmt.setString(2, author.getFirstName());
            stmt.setString(3, author.getLastName());
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) { // Checks to see if anything was inserted
                System.out.println("A new author was inserted successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a author entity in database if it exists using a author object
     * @param author
     */
    @Override
    public void update(Author author) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "UPDATE Author SET firstName=?, lastName=? WHERE authorID=?"; // Searches for author id to update any changes
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, author.getFirstName());
            stmt.setString(2, author.getLastName());
            stmt.setInt(3, author.getAuthorID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing author was updated successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a author from author table if the entity exists
     * @param author 
     */
    @Override
    public void delete(Author author) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "DELETE FROM Author WHERE authorID = ?"; // Deletes author based on authorid searched
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, author.getAuthorID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A author was deleted successfully!");
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
            String sql = "SELECT * FROM Author WHERE authorID = -1";//We just need this sql query to get the column headers
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