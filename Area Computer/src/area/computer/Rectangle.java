/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.computer;

/**
 *
 * @author Jay Jemino Ababon
 */
public class Rectangle extends Area{
   double length, width;
    
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    @Override
    double ComputeArea() {
        return length * width;
    }
}
