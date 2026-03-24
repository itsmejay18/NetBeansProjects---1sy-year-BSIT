/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package update;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Update {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] animals = {"Panther","Leopard","Jaguar","Cat","Puma","Leon"};
		System.out.println("My Array:  "+Arrays.toString(animals));
		
		String add1 = "Python";
		String add2 = "Anaconda";
		
		int index1 = 0;
		int index2 = 4;
		
		for(int a = 0; a < animals.length; a++){
			if(a == index1){
				animals[a] = add1;
			}
			if(a == index2){
				animals[a] = add2;
			}
		}
		System.out.println("New Array :  "+Arrays.toString(animals));
    }
    
}
