/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch2;
import java.util.*;
/**
 *
 * @author user
 */
public class BinarySearch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int [] numbers = new int [7];
        System.out.println("Enter Value For Array");
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = sc.nextInt();
    }
    Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter Number To Find");
        int toFind = sc.nextInt();
        
    System.out.println(binarySearch(numbers,toFind));
    }
    
    static int binarySearch (int [] numbers , int toFind){
        int low = 0;
        int high = numbers.length-1;
        
        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];
            
            if (toFind == middleNumber) {
                return middlePosition;
            }
            if (toFind < middleNumber) {
                high  = middlePosition -1;
            }
            else {
                low = middlePosition +1;
            }
        }
        return -1;
    }
    
}
