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
public class Num4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Shape circle = new Circle();
    Shape square = new Square();
    Shape triangle = new Triangle();
    
    circle.draw();
    circle.CalculateArea();
    System.out.println();
    square.draw();
    square.CalculateArea();
    System.out.println();
    triangle.draw();
    triangle.CalculateArea();
    }
    
}
