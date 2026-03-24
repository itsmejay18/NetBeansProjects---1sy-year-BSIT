
package number6;


public class Cube extends Shape3D{
     int a = 10;
    
    @Override
    void Calculatevolume () {
        System.out.println("Cube Volume = " + a * a);
    }
    @Override
    void CalculateSurfaceArea () {
        System.out.println("Cube Volume = " + 6 * (a*a));
    }
}
