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
public class Circle extends Area{
    
     double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double ComputeArea() {
        return Math.PI * radius * radius;
    }
}
