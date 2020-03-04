package question5;

public class functionTable {
    
    /************************************************
     * functionTable class created and performs math* 
     * operations and prints results in a table.    *
     ************************************************/
    
    public static void main(String[] args) { //Main method
        
        /**********************************************
         *Prints table heading with spacing formatted.*
         **********************************************/
        
        System.out.printf("%5s","N","10*N","ABS(N)","N^2");
        System.out.printf("%11s","10*N");
        System.out.printf("%12s","ABS(N)");
        System.out.printf("%8s","N^2");
        System.out.println("\n---------------------------------------");
        
        /***********************************************
         * Loop runs only from -2 to 2.                *
         * Performs operations for each time loop runs.*
         ***********************************************/
        
        for(long n = -2; n <= 2; n += 1) { // Only loop from -2 adding 1 until 2
            System.out.printf("%5s",n); // Prints the number
            System.out.printf("%10s",n*10); // Multipies n by 10 and prints value
            System.out.printf("%10s",(Math.abs(n))); // Finds absolute value of n and prints
            System.out.printf("%10s", (Math.pow(n,2))); // Finds n to the power of 2 and prints
            System.out.println("\n"); // Prints new line after operations performed.
        }
    }
    
}
