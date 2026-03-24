
package discussion;
import java.util.Scanner;
import java.util.Arrays;

public class Discussion {

    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int array [] = new int [5];
        
        for ( int i = 0; i < array.length;i++ ) {
            System.out.println("Enter value at index of " + i + " ");
            array [i] = sc.nextInt();
        }
        
        System.out.println("Old Array " + Arrays.toString(array) );
         int n = array.length;
         
         int newarray [] = new int [n + 1];
         System.out.println("Enter New Value ");
         int cvalue = sc.nextInt();
         System.out.println("Enter Index");
         int index = sc.nextInt();
         
        
        for (int i = 0; i < array.length; i++) {
            newarray [i] = array[i];
        }
        newarray[index] = cvalue;
       
        for (int i = index + 1; i < newarray.length; i++) {
            newarray[i] = array[i -1];
           
        }
        System.out.println("New Array " + Arrays.toString(newarray));
        
         
        
        
    }
    
}
