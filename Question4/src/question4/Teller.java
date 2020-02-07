/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Jefferson
 */
public class Teller {
    private double feeCollection = 0.00;
    private double feeAmount = 5.00;
    
    public void setFeeAmount(double amount) {
        this.feeAmount = amount;
    } 
    
    private void collectFee(Account holder) {
        holder.appliedFee(feeAmount);
        this.feeCollection += feeAmount;
        System.out.println("Total collected fees: $" + feeCollection);
    }
    
    private boolean fundsCheck(Account holder, double funds) {
        if (holder.getBalance() >= (funds + 5))
        {
            return true;
        }
        else
        {
            return false;
        }        
    }
    
    public void transfer(Account sender, Account receiver, double transferMoney) {
        if (fundsCheck(sender,transferMoney)) {
            sender.withdraw(transferMoney);
            receiver.deposit(transferMoney);
            System.out.println("Money transfer complete.\n$" + transferMoney + " has been transferred from " + sender.getName() + " to " + receiver.getName() + ".");
            System.out.printf(sender.getName() + "'s Balance: $%,.2f%n",sender.getBalance()-5);
            System.out.printf(receiver.getName() + "'s Balance: $%,.2f%n",receiver.getBalance());
            collectFee(sender);
            
        }
        else 
        {
            System.out.println("Error, insufficent funds of: $" + transferMoney + "\nAccount Holder: " + sender.getName() + "\nAccount balance: $" + sender.getBalance());
        }
        
        
    }
}
