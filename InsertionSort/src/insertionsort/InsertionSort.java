
package insertionsort;
import java.util.*;
public class InsertionSort {

    
    public static void main(String[] args) {
    int [] myArray = {5,7,3,6};
    System.out.println("Unsorted Array: " + Arrays.toString(myArray));
    insertionSort(myArray);
    System.out.println("Unsorted Array: " + Arrays.toString(myArray));
    }
    
    static void insertionSort (int [] myArray) {
        
        int n = myArray.length;
        
        for(int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = key;
        }
    }
    
}
