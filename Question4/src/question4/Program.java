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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account myAccount = new Account("Baris Manco",500.00);
        Account myAccount2 = new Account("Sezen Aksu",400.00);
        System.out.printf(myAccount.getName() + "'s Balance: $%,.2f%n",myAccount.getBalance());
        System.out.printf(myAccount2.getName() + "'s Balance: $%,.2f%n",myAccount2.getBalance());
        myAccount.withdraw(600.00, 5.00);
        myAccount2.deposit(600.00);
        System.out.printf(myAccount.getName() + "'s Balance: $%,.2f%n",myAccount.getBalance());
        System.out.printf(myAccount2.getName() + "'s Balance: $%,.2f%n",myAccount2.getBalance());
        System.out.printf("Total fees collected: %n");

    }
    public static void transfer(Account from, Account to, double funds, double fee) {
        //if (funds > )
        from.withdraw(funds, fee);
        to.deposit(funds);
        System.out.printf("Total fees collected: $%,.2f%n",fee);
    }
}
