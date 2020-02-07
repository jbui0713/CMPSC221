/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.Scanner;
/**
 *
 * @author jjb6569
 */
public class Product3Integers {

    /**
     * @param args the command line arguments
     */
    
    private static int x;
    private static int y;
    private static int z;
    private static int result;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scan.nextInt();
        System.out.println("Enter y: ");
        y = scan.nextInt();
        System.out.println("Enter z: ");
        z = scan.nextInt();
        result = x*y*z;
        System.out.printf("Product is %d%n", result);
    }
    
}
