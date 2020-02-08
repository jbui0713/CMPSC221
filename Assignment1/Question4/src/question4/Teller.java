package question4;

public class Teller { //Teller class created, holds all transferring functions
    private double feeCollection = 0.00; // Collected fees and set to $0.00 
    private double feeAmount = 5.00; // Fee amount for transfers and set as $5.00
    
    public void setFeeAmount(double amount) { // Sets fee amount to input given
        this.feeAmount = amount; // feeAmount gets updated to input
    } 
    
    private void collectFee(Account holder) { // Bank collects successful transfer fee
        holder.appliedFee(feeAmount); // Fee gets taken from the sender
        this.feeCollection += feeAmount; // Fees collected gets updated
        System.out.println("Total collected fees: $" + feeCollection); // Prints the fees collected
    }
    
    private boolean fundsCheck(Account holder, double funds) { // Checks if a transfer if possible
        if (holder.getBalance() >= (funds + 5)) // The balance in the transferring account has to be 
        {                                       // greater than the funds they want to transfer plus 
            return true;                        // the transfer fee
        }
        else
        {
            return false;
        }        
    }
    
    public void transfer(Account sender, Account receiver, double transferMoney) { // Transfers money from one account to another
        if (fundsCheck(sender,transferMoney)) { // Runs fundsCheck method to make it can transfer money
            sender.withdraw(transferMoney); // Withdraws money from sender 
            receiver.deposit(transferMoney); // Deposits money into receiver's account
            System.out.println("Money transfer complete.\n$" + transferMoney + " has been transferred from " + sender.getName() + " to " + receiver.getName() + ".");
            System.out.printf(sender.getName() + "'s Balance: $%,.2f%n",sender.getBalance()-5);
            System.out.printf(receiver.getName() + "'s Balance: $%,.2f%n",receiver.getBalance());
            collectFee(sender);
            // Prints transcation that occurred, then collects the transfer fee from sender
            
        }
        else // If it fails then an error is printed to the screen
        {
            System.out.println("Error, insufficent funds of: $" + transferMoney + "\nAccount Holder: " + sender.getName() + "\nAccount balance: $" + sender.getBalance());
        }
        
        
    }
}
