package entity;

/**
 *
 * @author jjb6569
 */
public class Driver
{ // Class Driver created
    private int driverID; // ID of driver
    private String firstName; // First name of driver
    private String lastName; // Last name of driver
    private int age; // Age of driver
    private String dob; // Date of Birth of driver
    private int driverRank; // Rank of driver
    private int driftPoints; // Points of driver
    private String country; // Country of driver
    private String team; // Team of driver
    private byte[] image; // Picture of driver
    
    public Driver(int driverID, String firstName, String lastName, String dob, int age, int driverRank, int driftPoints, String country, String team, byte[] image)
    { // Constuctor created for driver
        this.driverID = driverID; // Returns driver id 
        this.firstName = firstName; // Returns first name
        this.lastName = lastName; // Returns last name
        this.age = age; // Returns age
        this.dob = dob; // Returns date of birth
        this.driverRank = driverRank; // Returns rank 
        this.driftPoints = driftPoints; // Returns points
        this.country = country; // Returns country
        this.team = team; // Returns team
        this.image = image; // Returns picture
    }

    public int getDriverID() { // Gets driver id
        return driverID;
    }

    public String getFirstName() { // Gets first name
        return firstName;
    }

    public String getLastName() { // Gets last name
        return lastName;
    }

    public int getAge() { // Gets age
        return age;
    }

    public String getDob() { // Gets date of birth
        return dob;
    }

    public int getDriverRank() { // Gets rank
        return driverRank;
    }

    public int getDriftPoints() { // Gets points 
        return driftPoints;
    }

    public String getCountry() { // Gets country 
        return country;
    }

    public String getTeam() { // Gets team
        return team;
    }
    
    public byte[] getImage() { // Gets image
        return image;
    }
    
    @Override
    public String toString() { // Returns unique identifer of object as a string
        return "Driver{" + "driverID=" + driverID + ", firstName=" + firstName + ", lastName=" + lastName + "dob=" + dob + ", age=" + age + ", driverRank=" + driverRank + ", driftPoints=" + driftPoints + ", country=" + country + ", team=" + team + ", image=" + image + '}';
    }
}
