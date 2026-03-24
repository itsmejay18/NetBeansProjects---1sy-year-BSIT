
package delete;
import java.util.Arrays;

public class Delete {

    
    public static void main(String[] args) {
    
        int [] myArray = {134,23,3,32,65,6,7,8,95,10};
   System.out.println("My Array:  "+Arrays.toString(myArray));
   
   int [] newArray = new int[myArray.length-2];
   
   int indexDel1 = 4;
   int indexDel2 = 5;
   
   int b = 0;
   
   for(int a = 0; a <  myArray.length; a++){
     if(a != indexDel1 && a != indexDel2){
       newArray[b] = myArray[a];
       b++;
     } 
   }
   System.out.println("New Array:  "+Arrays.toString(newArray));
    }
    
}
