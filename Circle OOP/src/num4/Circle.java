/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num4;

/**
 *
 * @author user
 */
public class Circle extends Shape{
    @Override
    void draw () {
        System.out.println("Drawing Circle");
    } 
    @Override
    void CalculateArea () {
        System.out.println("Circle Area = 100");
    }
}
