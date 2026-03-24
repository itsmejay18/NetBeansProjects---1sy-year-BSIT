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
public class Circle extends Shape {
    double radius = 10;  
    void Construct () {
        System.out.println("Drawing A Circle");
    }    
    void Area (){
        System.out.println("The Area Of the Circle is: " + (Math.PI * radius * radius));
    }
}
