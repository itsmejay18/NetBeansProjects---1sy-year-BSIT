/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number6;

/**
 *
 * @author user
 */
public class Number6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Shape3D sphere = new Sphere();
    Shape3D cube = new Cube();
    
    sphere.Calculatevolume();
    sphere.CalculateSurfaceArea();
    cube.Calculatevolume();
    cube.CalculateSurfaceArea();
    }
    
}
