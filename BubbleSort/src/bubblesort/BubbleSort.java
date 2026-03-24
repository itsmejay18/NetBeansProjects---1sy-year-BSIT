
package bubblesort;
import java.util.*;
public class BubbleSort {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int [] myArray = new int [5];
    
    System.out.println("Enter Value For Array");
    for (int i = 0; i < myArray.length; i++) {
        myArray[i] = sc.nextInt();
    }
    
    System.out.println("Unsorted Array : " + Arrays.toString(myArray));
    Bubblesort(myArray);
    System.out.println("Sorted Array : " + Arrays.toString(myArray));
    
    System.out.println("Enter Number To Find");
    int toFind = sc.nextInt();
        
    }
    
    static void Bubblesort (int [] myArray) {
        
    int n = myArray.length;
    
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - 1 - i; j++) {
            if (myArray[j] > myArray[j + 1]) {
                int temp = myArray[j];
                myArray[j] = myArray [j + 1];
                myArray[j + 1] = temp; 
            }
            
        }
        
    }
    
    }
    
}
