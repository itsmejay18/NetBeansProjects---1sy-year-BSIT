/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;
import java.util.*;
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] myArray = {1,7,4,3};
    
    System.out.println("Unsorted Array: " + Arrays.toString(myArray));
    selectionSort(myArray);
    System.out.println("Unsorted Array: " + Arrays.toString(myArray));
        
    }
    
    static void selectionSort (int [] myArray) {
        
        int n = myArray.length;
        
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (myArray[j] < myArray[minIndex]){
                    minIndex = j;
                }
                int temp = myArray[minIndex];
                myArray[minIndex] = myArray[i];
                myArray[i] = temp;
                for (int Array: myArray){
                System.out.print(Array + " "); 
            }
            System.out.println();
            }
        }
    }
    
}
