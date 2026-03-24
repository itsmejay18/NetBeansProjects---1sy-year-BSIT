
package indexsearch;
import java.util.Scanner;
import java.util.Arrays;
public class IndexSearch {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int [] myArray = new int [10];
    
    for (int p = 0; p < 10; p++){
        System.out.println("Enter Value For Array"+": ");
        myArray[p] = sc.nextInt();
        
    }
    
        System.out.println("Array = " + Arrays.toString(myArray));
        System.out.println();
        System.out.println("Enter First number to Find");
        int b = sc.nextInt();
        System.out.println("Enter Second number to Find");
        int c = sc.nextInt();
        System.out.println("Index position of " + b + " :" + findIndex(myArray,b));
        System.out.println("Index position of " + c + " :" + findIndex(myArray,c));
    }
    
    public static int findIndex(int [] myArray, int num){
        if (myArray == null) return -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) return i;
        }
        return - 1;
    }
    
}
