
package shutdowncomputer;

import java.io.IOException;
public class ShutdownComputer {

   
    public static void main(String[] args) {
        try {
                Runtime.getRuntime().exec("shutdown /s /t 0");
                } catch (IOException e) {
                System.out.println("Error shutting down: " + e.getMessage());
            }

        }
    
    }
