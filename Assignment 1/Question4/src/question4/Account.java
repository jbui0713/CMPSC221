package question4;

public class Account { 
    // Account class created
    private String name; // Name of the Account
    private double balance; // Balance in person's account

    public String getName() { // Gets name of Account
        return name;
    }

    public Account(String name, double balance) { // Creates the Account with name and balance given
        this.name = name; // Name is set to input given
        setBalance(balance); // Balance is set to input given
    }
//
    public void setName(String name) { // Sets name for Account
        if(name == "") // If the name is equal to empty string
        {
            this.name = "John Doe"; // Sets the name of account to John Doe
        }
        else
        {
            this.name = name; // Otherwise, updates name of account to input given
        }
    }

    public double getBalance() { // Gets the balance from account
        return balance;
    }

    private void setBalance(double balance) { // Sets the balance for account
        if(balance < 0) // Balance cannot be less than 0
        {
         System.out.println("Error, negative balance for account holder: " + name);
          this.balance = this.balance;  // Balance will revert back to previous balance 
        }
        else
        {
            this.balance = balance; // Otherwise balance gets updated to new balance
        }
      
    }
    public double deposit(double deposit) // Deposits money into account 
    {
        if (deposit < 1) // Deposit cannot be less than $1
        {
            System.out.println("Error! Invalid Deposit!"); // Prints error and will still have the same balance
            this.balance = balance;
        }
        else
        {
            this.balance = deposit + balance; // Otherwise balance is updated with deposit added
        }
        return balance; // Returns balance
    }
    public double withdraw(double withdraw) { // Withdraws money from account
        if (withdraw < 1) // Withdraw cannot be less than $1
        {
            System.out.println("Error! Invalid Withdraw of: $" + withdraw);
            this.balance = balance; // Prints error and will still have same balance
        }
        else if (withdraw > balance) // Withdraw cannot be more than the balance in the account
        {
            System.out.println("Error! Invalid Withdraw of: $" + withdraw);
            this.balance = balance; // Prints error and will still keep balance
        }
        else
        {
            this.balance = balance - withdraw; // Otherwise balance gets updated and subtracts money from account
        }
        return balance; // Returns the balance
    }
    public double appliedFee( double fee) { // Applies fee when transferring money
        this.balance = balance - fee; // Balance of account gets fee subtracted 
        return balance; // Returns the balance
    }
}
