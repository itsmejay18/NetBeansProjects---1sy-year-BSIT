/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thougths1;

/**
 *
 * @author user
 */
public class Thougths1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AccountoftheBank as = new AccountSaving(); 
    AccountoftheBank cb = new CurrentBalance();
    
        as.deposit(1000);
        as.displayBalance();
        as.withdraw(1500);
        as.displayBalance();
        
        System.out.println();
        
        cb.deposit(2000);
        cb.displayBalance();
        cb.withdraw(1500);
        cb.displayBalance();

    

        
           
    }
    
}
