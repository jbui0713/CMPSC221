package question1;

public class Invoice {
    // Invoice Class created 
    private String partNumber; // Part Number
    private String partDescription; // Description about part
    private int quantity; // Quantity of item being purchased
    private double price; // Price per item
    
    public Invoice(){
        // Constructor Invoice sets default values
        setPartNumber("Default"); // Setting part number to name default
        setPartDescription("Default description"); // Setting a default for part description
        setQuantity(0); // Setting quantity to 0
        setPrice(0.00); // Setting price to defaultly $0.00
    }
    
    public String getPartNumber() { // Gets part number
        return partNumber;
    }

    public void setPartNumber(String partNumber) { // Sets part number to input given
        this.partNumber = partNumber; // Updates part number to input
    }

    public String getPartDescription() { // Gets the part desciprtion
        return partDescription;
    }

    public void setPartDescription(String partDescription) { // Sets part description to input given
        this.partDescription = partDescription; // Updates part descriptuon to input
    }

    public int getQuantity() { // Gets quantity of item
        return quantity;
    }

    public void setQuantity(int quantity) { // Sets item quantity to input given
        if(quantity < 0) // Quantity input cannot be less than 0
        {
            this.quantity = 0; // Sets quantity to 0 if true
        }
        else
        {
            this.quantity = quantity; // Otherwise updates quantity to input value
        }
    }
        

    public double getPrice() { // Gets item price
        return price;
    }

    public void setPrice(double price) { // Sets item price to input given
        if(price < 0) // Item price cannot be less than 0
        {
            this.price = 0.00; // Sets the price to 0.00 if true 
        }
        else
        {
            this.price = price; // Otherwise price is updated to input value
        }
    }
    public double getInvoiceAmount() { // Gets product of price and quantity as Invoice Amount
        return (price*quantity);
    }
}
