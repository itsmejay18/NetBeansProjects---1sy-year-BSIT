
package recursive;


public class Recursive {

   
    public static void main(String[] args) {

         int res = factorial(5);
         System.out.println(res);
    }
    

    public static int factorial (int numbers) {
        
        if (numbers == 1) {
            return 1;
        }
       return numbers * factorial(numbers -1);
    }
}
