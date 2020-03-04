package question3;

public class Program {
    // Program class created
    public static void main(String[] args) {
        // Main method
        Account myAccount = new Account("Baris Manco",-10.95); // Creates new Account object named myAccount
        Account myAccount2 = new Account("Sezen Aksu",1000.12); // Creates new second object named myAccount2
        myAccount.deposit(100); // Deposits money in myAccount
        myAccount2.withdraw(1500); // Withdraws money from myAccount2
        myAccount2.withdraw(200); // Withdraws money from myAccount2
        System.out.printf(myAccount.getName() + "'s Balance: $%,.2f%n",myAccount.getBalance());
        System.out.printf(myAccount2.getName() + "'s Balance: $%,.2f%n",myAccount2.getBalance());
        // Prints the balance of each account
    }
    
}
