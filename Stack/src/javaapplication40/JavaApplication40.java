
package javaapplication40;

import java.util.Stack;

public class JavaApplication40 {

    public static void main(String[] args) {
        
        //stack
        //push
        //pop
        //empty
        //search
        
        Stack<String> stack = new Stack<String>();
        
        
        //System.out.println(stack.empty());
        
       stack.push("mark");
        stack.push("arnie");
         stack.push("jeph");
          stack.push("patotoya");
          
          //System.out.println(stack.pop());
          //System.out.println(stack.peek());
          
          //stack.pop();
          
          String name = stack.pop();
          //System.out.println(stack.peek());
          
          //System.out.println(stack);
          System.out.println(name);
          System.out.println(stack.search("mark"));
          
          
    }
    
}
