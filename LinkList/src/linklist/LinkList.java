
package linklist;

import java.util.*;

public class LinkList {

    
    public static void main(String[] args) {
    
        LinkedList <String> list = new LinkedList <String>();
        
        list.add("Arnie");
        list.add("kian");
        list.add("jay");
        
        System.out.println(list);
        
        for (String display: list) {
            System.out.println(display);
        }
        
        list.set(0, "jericho");
        
        System.out.println(list);
        
       
    }
    
}
