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
public class Triangle extends Shape{
    @Override
    void draw () {
        System.out.println("Drawing Triangle");
    } 
    @Override
    void CalculateArea () {
        System.out.println("Triangle Area = 50");
    }
}
