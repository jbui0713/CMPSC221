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
public class Invoice {

    /**
     * @param args the command line arguments
     */
    
    private String partNumber; // Part Number
    private String partDescription; // Description about part
    private int quantity; // Quantity of item being purchased
    private double price; // Price per item
    
    public Invoice(){
        setPartNumber("Default");
        setPartDescription("Default description");
        setQuantity(0);
        setPrice(0.00);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0)
        {
            this.quantity = 0;
        }
        else
        {
            this.quantity = quantity;
        }
    }
        

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
        {
            this.price = 0.0;
        }
        else
        {
            this.price = price;
        }
    }
    public double getInvoiceAmount() {
        return (price*quantity);
    }
}
