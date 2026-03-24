/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Insert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [] myArray = {21,2,3,4,5,34,7,8,65,10};
   System.out.println("My Array:  "+Arrays.toString(myArray));
   
   int [] newArray = new int[myArray.length+2];
   
   int add1 = 23;
   int add2 = 19;
   
   int index1  = 0;
   int index2 = 5;
   
   int o = 0;
   for(int i = 0; i < newArray.length; i++){
   if(i == index1){
     newArray[i] = add1;
   } else if (i == index2){
     newArray[i] = add2;
   } else {
     newArray[i] = myArray[o];
     o++; 
   }
   }
   
   System.out.println("New Array:  "+Arrays.toString(newArray));
    }
    
}
