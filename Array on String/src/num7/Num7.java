/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num7;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Num7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String [] oldArray = {"Panther", "Leopard", "Jaguar", "Tiger", "Ant", "Puma", "Lion"};
        System.out.println("Old Array " + Arrays.toString(oldArray));
        
        String add1 = "Python";
        String add2 = "Anaconda";
        
        int index1 = 0;
        int index2 = 4;
        
        for (int i = 0; i < oldArray.length; i++) {
            if (i == index1) {
                oldArray[i] = add1;
            }
            else if (i == index2) {
                oldArray[i] = add2;
            }
                       
        }
        System.out.println("New Array " + Arrays.toString(oldArray));
    }
    
}
