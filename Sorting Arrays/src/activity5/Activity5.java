/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity5;
import java.util.*;
public class Activity5 {

    /**
     * @param args the command line arguments
     */
    static void Bubblesort (int [] myArray) {
        
    int n = myArray.length;
    
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - 1 - i; j++) {
            if (myArray[j] > myArray[j + 1]) {
                int temp = myArray[j];
                myArray[j] = myArray [j + 1];
                myArray[j + 1] = temp; 
            }
            for (int Array: myArray){
                System.out.print(Array + " "); 
            }
            System.out.println();
            
        }
        
    }
    
    }
    
    public static void main(String[] args) {
    int [] myArray = {12,5,45,7,87,43,21,97};
    System.out.println("Unsorted Array: " + Arrays.toString(myArray));
    Bubblesort(myArray);
    System.out.println("Sorted Array: " + Arrays.toString(myArray));
    }
    
    
    
}
