package question2;
import java.util.Scanner; // Imported Scanner class 

public class Product3Integers {
    // Product3Integers created
    private static int x; // First integer as x
    private static int y; // Second integer as y
    private static int z; // Third integer as z
    private static int result; // Result of product x, y, z
    
    public static void main(String[] args) {
        // Main method
        Scanner scan = new Scanner(System.in); // Creates new object of Scanner class named scan
        System.out.println("Enter x: "); // Prints message for user to enter x value
        x = scan.nextInt(); // Scans and stores input value to x
        System.out.println("Enter y: "); // Prints message for user to enter y value
        y = scan.nextInt(); // Scans and stores input value to y
        System.out.println("Enter z: "); // Prints message for user to enter z value
        z = scan.nextInt(); // Scans and stores input value to z
        result = x*y*z; // Multiplies the values stored for x, y, z together
        System.out.printf("Product is %d%n", result); // Prints the result
    }
    
}
