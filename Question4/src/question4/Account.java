/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author JeffersonBui
 */
public class Account {
    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public Account(String name, double balance) {
        this.name = name;
        setBalance(balance);
    }
//
    public void setName(String name) {
        if(name == "")
        {
            this.name = "John Doe";
        }
        else
        {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if(balance < 0)
        {
         System.out.println("Error, negative balance for account holder: " + name);
          this.balance = this.balance;  
        }
        else
        {
            this.balance = balance;
        }
      
    }
    public double deposit(double deposit)
    {
        if (deposit < 1)
        {
            System.out.println("Error! Invalid Deposit!");
            this.balance = balance;
        }
        else
        {
            this.balance = deposit + balance;
        }
        return balance;
    }
    public double withdraw(double withdraw) {
        if (withdraw < 1)
        {
            System.out.println("Error! Invalid Withdraw of: $" + withdraw);
            this.balance = balance;
        }
        else if (withdraw > balance)
        {
            System.out.println("Error! Invalid Withdraw of: $" + withdraw);
            this.balance = balance;
        }
        else
        {
            this.balance = balance - withdraw;
        }
        return balance;
    }
    public double appliedFee( double fee) {
        this.balance = balance - fee;
        return balance;
    }
}
