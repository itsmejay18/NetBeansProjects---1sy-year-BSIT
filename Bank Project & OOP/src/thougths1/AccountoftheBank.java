package thougths1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public abstract class AccountoftheBank {
    
    double balance;
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    void displayBalance() {
        System.out.println("Balance: ₱ " + balance);
    }
}
