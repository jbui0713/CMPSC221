/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author jjb6569
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account myAccount = new Account("Baris Manco",-10.95);
        Account myAccount2 = new Account("Sezen Aksu",1000.12);
        myAccount.deposit(100);
        myAccount2.withdraw(1500);
        myAccount2.withdraw(200);
        System.out.printf(myAccount.getName() + "'s Balance: $%,.2f%n",myAccount.getBalance());
        System.out.printf(myAccount2.getName() + "'s Balance: $%,.2f%n",myAccount2.getBalance());
    }
    
}
