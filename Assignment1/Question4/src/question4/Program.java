package question4;

public class Program {
    // Program class created 
    public static void main(String[] args) {
        // Main method
        Account myAccount = new Account("Baris Manco",500.00); // Creates new Account object named myAccount
        Account myAccount2 = new Account("Sezen Aksu",400.00); // Creates new second object named myAccount2
        Teller tdBank = new Teller(); // Creates new Teller object named tdBank
        tdBank.transfer(myAccount, myAccount2,600); // myAccount transfers money to myAccount2
        System.out.println("\n"); // New line to separate 
        tdBank.transfer(myAccount2, myAccount,50.52); // myAccount2 transfers money to myAccount
        System.out.println("\n"); // New line to separate 
        tdBank.transfer(myAccount, myAccount2,50.52); // myAccount transfers money to myAccount2

    }
} 
