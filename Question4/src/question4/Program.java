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
        Teller tdBank = new Teller();
        tdBank.transfer(myAccount, myAccount2,600);
        tdBank.transfer(myAccount2, myAccount,50.52);
        tdBank.transfer(myAccount, myAccount2,50.52);

    }
} 
