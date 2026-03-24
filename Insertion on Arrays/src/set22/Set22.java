
package set22;


public class Set22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String names [] = {"Jon", "Sansa", "Anya", "Brian", "Rob"};
        System.out.println(names[2]);
        System.out.println();
        
        names[4] = "Stark";
        
        System.out.println(names[4]);
        System.out.println();
        
        for (int i = 0; i < names.length;i++){
            System.out.println(names[i]);
        }
    }
}
