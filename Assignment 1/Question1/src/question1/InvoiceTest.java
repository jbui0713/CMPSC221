package question1;

public class InvoiceTest {
    // InvoiceTest class created 
    public static void main(String[] args) {
        // Main method created 
        Invoice myInvoice = new Invoice(); // Creates new object of Invoice class named myInvoice
        myInvoice.setPartDescription("Water Bottle"); // Sets part description of myInvoice to "Water Bottle"
        myInvoice.setPartNumber("B0001"); // Sets part number myInvoice to "B0001"
        myInvoice.setQuantity(-1); // Sets item quantity of myInvoice to -1
        myInvoice.setPrice(-2.00); // Sets item price of myInvoice to -2.00
        myInvoice.getInvoiceAmount(); // Gets Invoice Amount
        System.out.println("Part number: " + myInvoice.getPartNumber()); // Prints part number
        System.out.println("Part description: " + myInvoice.getPartDescription()); // Prints part description
        System.out.println("Part quantity: " + myInvoice.getQuantity()); // Prints part quantity
        System.out.println("Part price: " + myInvoice.getPrice()); // Prints part price
        System.out.println("Invoice amount: " + myInvoice.getInvoiceAmount()); // Prints Invoice Amount
        System.out.println("\n"); // New line to separate 
        Invoice myInvoice2 = new Invoice(); // Creates second invoice object
        myInvoice2.setPartDescription("Orange Juice"); // Sets part description of myInvoice2 to " Orange Juice:
        myInvoice2.setPartNumber("B0002"); // Sets part number of myInvoice2 to "B0002"
        myInvoice2.setQuantity(20); // Sets item quantity to 20
        myInvoice2.setPrice(2.90); // Sets item price to 2.90
        System.out.println("Part number: " + myInvoice2.getPartNumber()); // Prints part number
        System.out.println("Part description: " + myInvoice2.getPartDescription()); // Prints part description
        System.out.println("Part quantity: " + myInvoice2.getQuantity()); // Prints part quantity
        System.out.println("Part price: " + myInvoice2.getPrice()); // Prints part price
        System.out.println("Invoice amount: " + myInvoice2.getInvoiceAmount()); // Prints Invoice Amount 
        System.out.println("\n"); // New line to separate 
        Invoice myInvoice3 = new Invoice(); // Creates third invoice object
        myInvoice3.setPartDescription("Mango Juice"); // Sets part description of myInvoice3 to "Mango Juice"
        myInvoice3.setPartNumber("B0003"); // Sets part number of myInvoice3 to "B0003"
        myInvoice3.setQuantity(200); // Sets the item quantity to 200
        myInvoice3.setPrice(6.99); // Sets the item price to 6.99
        System.out.println("Part number: " + myInvoice3.getPartNumber()); // Prints part number
        System.out.println("Part description: " + myInvoice3.getPartDescription()); // Prints part description
        System.out.println("Part quantity: " + myInvoice3.getQuantity()); // Prints part quantity
        System.out.println("Part price: " + myInvoice3.getPrice()); // Prints part price
        System.out.println("Invoice amount: " + myInvoice3.getInvoiceAmount()); // Prints Invoice Amount
    }
    
}
