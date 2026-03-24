
package set26;


public class Set26 {

    
    public static void main(String[] args) {
        
    int [][] number  = {{5, 6, 9},
                       {1, 2, 3}};
    
    for (int i = 0; i < number.length; i++){
        for (int p = 0; p < number[i].length ; p++){
            System.out.print(number[i][p] + " ");
        }
        System.out.println();
    }
    }
    
}
