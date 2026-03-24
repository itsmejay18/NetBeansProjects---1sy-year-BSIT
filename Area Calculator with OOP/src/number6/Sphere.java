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
public class Sphere extends Shape3D {
    int r = 10;
    double pi = 3.14;
    
    @Override
    void Calculatevolume () {
        System.out.println("Sphere Volume = " + (4/3) * (r * r) * pi);
    }
    @Override
    void CalculateSurfaceArea () {
        System.out.println("Sphere Volume = " + (4) * (r * r) * pi);
    }
}
