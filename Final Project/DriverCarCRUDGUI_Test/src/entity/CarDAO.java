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
public class CarDAO implements DAO<Car>{
    public CarDAO() {
        // Constuctor created named CarDAO
    }
    List<Car> cars; // Car table 
    /**
     * Get a single car entity as a car object
     * @param carID
     * @return 
     */
    @Override
    public Optional<Car> get(int carID) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try { // Tries the code below
            String sql = "SELECT * FROM Car WHERE carID = ?"; // Need this sql query to get the isbn
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, carID);
            rs = stmt.executeQuery();
            Car car = null;
            while (rs.next()) {
                car = new Car(rs.getInt("carID"), rs.getString("make"), rs.getString("model"), rs.getString("color"), rs.getInt("modelYear"), rs.getInt("driverID"));
            }
            return Optional.ofNullable(car);
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all car entities as a List
     * @return 
     */
    @Override
    public List<Car> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        cars = new ArrayList<>(); // Creates car as an array
        try { // Tries the code below
            String sql = "SELECT * FROM car";
            rs = db.executeQuery(sql);
            Car car = null;
            while (rs.next()) {
                car = new Car(rs.getInt("carID"), rs.getString("make"), rs.getString("model"), rs.getString("color"), rs.getInt("modelYear"), rs.getInt("driverID"));
                cars.add(car); // Adds cars to a list
            }
            return cars; // Returns the car list
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert a car object into car table
     * @param car 
     */
    @Override
    public void insert(Car car)
    {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "INSERT INTO Car(carID, make, model, color, modelYear, driverID) VALUES (?, ?, ?, ?, ?, ?)"; // Enters the inputs to add car into table
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, car.getCarID());
            stmt.setString(2, car.getMake());
            stmt.setString(3, car.getModel());
            stmt.setString(4, car.getColor());
            stmt.setInt(5, car.getModelYear());
            stmt.setInt(6, car.getDriverID());
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) { // Checks to see if anything was inserted
                System.out.println("A new car was inserted successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try an prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a car entity in database if it exists using a car object
     * @param car
     */
    @Override
    public void update(Car car) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "UPDATE Car SET make=?, model=?, color=?, modelYear=?, driverID=? WHERE carID=?"; // Searches for carID to update any changes
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, car.getMake());
            stmt.setString(2, car.getModel());
            stmt.setString(3, car.getColor());
            stmt.setInt(4, car.getModelYear());
            stmt.setInt(5, car.getDriverID());
            stmt.setInt(6, car.getCarID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing car was updated successfully!");
            }
        } catch (SQLException ex) { // Catches any errors thrown from try and prints the error
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a car from car table if the entity exists
     * @param car 
     */
    @Override
    public void delete(Car car) {
        DB db = DB.getInstance();
        try { // Tries the code below
            String sql = "DELETE FROM Car WHERE carID = ?"; // Deletes car based on carID searched
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, car.getCarID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A car was deleted successfully!");
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
            String sql = "SELECT * FROM Car WHERE carID = -1";//We just need this sql query to get the column headers
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
