
package linearsearch;
import java.util.Scanner;

public class LinearSearch {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int [] myArray = {2,12,15,11,7,9,45};
    int target = 7;
    System.out.println("Index position of 7 : " + linearsearch(myArray, target));
    
    }
    
    public static int linearsearch(int [] myArray, int target) {
        if (myArray == null) return -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == target) return i;
        }
        return - 1;
    }
    
}
