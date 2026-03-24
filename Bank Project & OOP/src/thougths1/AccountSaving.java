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
public class AccountSaving extends AccountoftheBank {

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₱" + amount + " into Savings Account");
    }
    
    @Override
    void withdraw(double amount) {
         if (balance >= amount) {
             balance -= amount;
        System.out.println("Withdrawn ₱" + amount + " from Current Balance");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

}
