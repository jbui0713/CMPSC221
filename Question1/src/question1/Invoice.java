package question1;

/**
 *
 * @author jjb6569
 */
public class Invoice {

    /**
     * Invoice Class 
     */
    
    private String partNumber; // Part Number
    private String partDescription; // Description about part
    private int quantity; // Quantity of item being purchased
    private double price; // Price per item
    
    public Invoice(){
        // Constructor Invoice sets default values
        setPartNumber("Default");
        setPartDescription("Default description");
        setQuantity(0);
        setPrice(0.00);
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
