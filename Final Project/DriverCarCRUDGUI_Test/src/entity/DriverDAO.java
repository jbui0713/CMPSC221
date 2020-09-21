package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import core.*;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jjb6569
 */
public class DriverDAO implements DAO<Driver>
{   
    public DriverDAO() {
        // Constuctor created named DriverDAO
    }
    List<Driver> drivers; // Driver table
    /**
     * Get a single driver entity as an driver object
     * @param driverID
     * @return 
     */                                    

    
    public void alert(String msg, String title) { // Alert method added in DAO to catch foreign key violation 
        Component rootPane = null;
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);
    }  
    
    @Override
    public Optional<Driver> get(int driverID) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try { // Tries the code below
            String sql = "SELECT * FROM Driver WHERE driverID = ?"; // Need this sql query to get the driver id
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, driverID);
            rs = stmt.executeQuery();
            Driver driver = null;
            while (rs.next()) {
                driver = new Driver(rs.getInt("driverID"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("dob"), rs.getInt("age"), rs.getInt("driverRank"), rs.getInt("driftPoints"), rs.getString("country"), rs.getString("team"), rs.getBytes("image"));
            } 
            return Optional.ofNullable(driver);
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all driver entities as a List
     * @return 
     */
    @Override
    public List<Driver> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        drivers = new ArrayList<>(); // Creates drivers as an array
        try { // Tries the code below
            String sql = "SELECT * FROM Driver ORDER BY driverID"; // Need this sql query to get the driver id and orders it numerically 
            rs = db.executeQuery(sql);
            Driver driver = null;
            while (rs.next()) {
                driver = new Driver(rs.getInt("driverID"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("dob"), rs.getInt("age"), rs.getInt("driverRank"), rs.getInt("driftPoints"), rs.getString("country"), rs.getString("team"), rs.getBytes("image"));
                drivers.add(driver); // Adds drivers to a list
            }
            return drivers; // Returns the driver list
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert an driver object into driver table
     * @param driver 
     */
    @Override
    public void insert(Driver driver)
    {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "INSERT INTO Driver(driverID, firstName, lastName, dob, age, driverRank, driftPoints, country, team, image) VALUES (?, ?, ?, ?, ?, ?, ? , ?, ?, ?)"; // Enters the inputs to add driver into table
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, driver.getDriverID());
            stmt.setString(2, driver.getFirstName());
            stmt.setString(3, driver.getLastName());
            stmt.setString(4, driver.getDob());
            stmt.setInt(5, driver.getAge());
            stmt.setInt(6, driver.getDriverRank());
            stmt.setInt(7, driver.getDriftPoints());
            stmt.setString(8, driver.getCountry());
            stmt.setString (9, driver.getTeam());
            stmt.setBytes(10, driver.getImage());
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) { // Checks to see if anything was inserted
                System.out.println("A new driver was inserted successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and shows alert message in place 
            alert("All fields must be populated, check again", "Insert error");
        }
    }
    
    /**
     * Update a driver entity in database if it exists using a driver object
     * @param driver
     */
    @Override
    public void update(Driver driver) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "UPDATE Driver SET firstName=?, lastName=?, dob=?, age=?, driverRank=?, driftPoints=?, country=?, team=?, image=? WHERE driverID=?"; // Searches for driver id to update any changes
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, driver.getFirstName());
            stmt.setString(2, driver.getLastName());
            stmt.setString(3, driver.getDob());
            stmt.setInt(4, driver.getAge());
            stmt.setInt(5, driver.getDriverRank());
            stmt.setInt(6, driver.getDriftPoints());
            stmt.setString(7, driver.getCountry());
            stmt.setString(8, driver.getTeam());
            stmt.setBytes(9, driver.getImage());
            stmt.setInt(10, driver.getDriverID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing driver was updated successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a driver from driver table if the entity exists
     * @param driver 
     */
    @Override
    public void delete(Driver driver) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "DELETE FROM Driver WHERE driverID = ?"; // Deletes driver based on driverid searched
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, driver.getDriverID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A driver was deleted successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            
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
            String sql = "SELECT * FROM Driver WHERE driverID = -1";//We just need this sql query to get the column headers
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
