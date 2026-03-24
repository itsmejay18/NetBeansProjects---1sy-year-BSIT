/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package update1;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Update1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] oldArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(oldArray));
    int n = oldArray.length;   
    int [] newArray = new int[n + 1];
    int a = 0;
    
    int add = 2;
    int index = 3;
    
    for (int i = 0; i < newArray.length; i++) {
        if (i == index) {
            newArray[i] = add;
        }
        else {
            newArray[i] = oldArray[a];
            a++;
        }
    }
    System.out.println(Arrays.toString(newArray));
    
    }
    
}
