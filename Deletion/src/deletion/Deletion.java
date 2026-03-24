/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletion;
import java.util.*;
public class Deletion {
    public static void main(String[] args) {
        
    int Myarray[] = {2, 6, 18, 20, 25};
        int index = 5; 
        if (index < 0 || index >= Myarray.length) {
            System.out.println("Invalid Index = " + index);
            return; 
        }

        int newarray[] = new int[Myarray.length - 1];

        for (int i = 0, k = 0; i < Myarray.length; i++) {
            if (i != index) {
                newarray[k] = Myarray[i];
                k++;
            }
        }
        System.out.println("Original: " + Arrays.toString(Myarray));
        System.out.println("New Array: " + Arrays.toString(newarray));
    }
}
