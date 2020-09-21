package entity;

/**
 *
 * @author jjb6569
 */
public class Car
{ // Class Car created
    private int carID; // ID of car
    private String make; // Make of car
    private String model; // Model of car
    private String color; // Color of car
    private int modelYear; // Year of car 
    private int driverID; // Driver ID of car
    
    public Car(int carID, String make, String model, String color, int modelYear, int driverID)
    { // Constuctor created for car
        this.carID = carID; // Returns carId 
        this.make = make; // Returns make
        this.model = model; // Returns model
        this.color = color; // Returns color
        this.modelYear = modelYear; // Returns model year
        this.driverID = driverID; // Returns driverID
    }

    public int getCarID() { // Gets the car's ID
        return carID;
    }

    public String getMake() { // Gets make of car
        return make;
    }

    public String getModel() { // Gets model of car
        return model;
    }

    public String getColor() { // Gets color of car
        return color;
    }

    public int getModelYear() { // Gets the year of car
        return modelYear;
    }

    public int getDriverID() { // Gets the car's driverID
        return driverID;
    }
    
    @Override
    public String toString() { // returns unique identifer of object as a string
        return "Car{" + "carID=" + carID + ", make=" + make + ", model=" + model + ", color=" + color + ", modelYear=" + modelYear + ", driverID=" + driverID + '}';
    }
}
