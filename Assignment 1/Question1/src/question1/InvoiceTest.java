/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author jjb6569
 */
public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Invoice myInvoice = new Invoice();
        myInvoice.setPartDescription("Water Bottle");
        myInvoice.setPartNumber("B0001");
        myInvoice.setQuantity(-1);
        myInvoice.setPrice(-2.00);
        myInvoice.getInvoiceAmount();
        System.out.println("Part number: " + myInvoice.getPartNumber());
        System.out.println("Part description: " + myInvoice.getPartDescription());
        System.out.println("Part quantity: " + myInvoice.getQuantity());
        System.out.println("Part price: " + myInvoice.getPrice());
        System.out.println("Invoice amount: " + myInvoice.getInvoiceAmount());
        Invoice myInvoice2 = new Invoice();
        myInvoice2.setPartDescription("Orange Juice");
        myInvoice2.setPartNumber("B0002");
        myInvoice2.setQuantity(20);
        myInvoice2.setPrice(3.99);
        System.out.println("Part number: " + myInvoice2.getPartNumber());
        System.out.println("Part description: " + myInvoice2.getPartDescription());
        System.out.println("Part quantity: " + myInvoice2.getQuantity());
        System.out.println("Part price: " + myInvoice2.getPrice());
        System.out.println("Invoice amount: " + myInvoice2.getInvoiceAmount());
        Invoice myInvoice3 = new Invoice();
        myInvoice3.setPartDescription("Mango Juice");
        myInvoice3.setPartNumber("B0003");
        myInvoice3.setQuantity(200);
        myInvoice3.setPrice(6.99);
        System.out.println("Part number: " + myInvoice3.getPartNumber());
        System.out.println("Part description: " + myInvoice3.getPartDescription());
        System.out.println("Part quantity: " + myInvoice3.getQuantity());
        System.out.println("Part price: " + myInvoice3.getPrice());
        System.out.println("Invoice amount: " + myInvoice3.getInvoiceAmount());
    }
    
}
