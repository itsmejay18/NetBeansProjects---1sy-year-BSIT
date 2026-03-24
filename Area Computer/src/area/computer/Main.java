
package area.computer;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Sa Circle
        System.out.print("Enter the radius of the Circle: ");
        double radius = s.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.ComputeArea());
        
        //Sa  Rectangle
        System.out.print("Enter the length of the Rectangle: ");
        double length = s.nextDouble();
        System.out.print("Enter the width of the Rectangle: ");
        double width = s.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.ComputeArea());
        
        s.close();
    }
    } 

