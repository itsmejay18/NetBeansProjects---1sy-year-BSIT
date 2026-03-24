package thougths2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Cylender extends Shape {
    double radius = 10;
    double height = 10; 
    void Construct() {
        System.out.println("Drawing A Cylinder");    
    }  
    void Area (){
        System.out.println("The Surface Area Of the Cylinder is: " + (2 * (Math.PI * radius) * (radius+height)));

    }
}
