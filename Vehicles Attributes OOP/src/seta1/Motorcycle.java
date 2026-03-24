/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seta1;

/**
 *
 * @author user
 */
public class Motorcycle extends Vehicle {
    
    @Override
    void StartEngine () {
        System.out.println("Motorcycle is Starting");
    }
    @Override
    void StopEngine () {
        System.out.println("Motorcycle is Stopping");
    }
}
