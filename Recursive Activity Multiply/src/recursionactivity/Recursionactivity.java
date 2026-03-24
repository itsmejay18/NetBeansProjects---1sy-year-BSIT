
package recursionactivity;

import java.util.Arrays;


public class Recursionactivity {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        int[] array = {7, 8, 5, 6};
        System.out.println(result(array, array.length));
    }
    
    public static int result(int[] array, int numbers) {
        if (numbers == 0) {
            return 1; 
        }
        return array[numbers - 1] * result(array, numbers - 1); 
    }
}
