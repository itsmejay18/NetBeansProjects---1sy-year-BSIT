
package act;


public class Act {

    
        static int countvowel = 0;
        static int countconsonant = 0;
    public static void main(String[] args) {
     
        String word = "HELLO";
        
        countvowel(word);
       
    }

    private static void countvowel(String words) {
        String word = words.toLowerCase();
        if (word.length() == 0) {
            return;
        }
        
        
        countvowel(word.substring(0, word.length() -1));
        
        char count = word.charAt(word.length()-1);
        
        
        if (count == 'a' ||count == 'e' ||count == 'i' ||count == 'o' ||count == 'u') {
             countvowel ++;
        }
        else {
            countconsonant ++;
        }
        
        System.out.println("vowel = " + countvowel);
        System.out.println("consonant = " + countconsonant);
    }
    
}
