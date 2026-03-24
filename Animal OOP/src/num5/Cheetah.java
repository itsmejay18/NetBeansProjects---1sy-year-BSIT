/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num5;

/**
 *
 * @author user
 */
public class Cheetah extends Animal {
    @Override
    void move () {
        System.out.println("Cheetah is Running");
    }
    
    private String name = "Jay";
    private String name1;
    
    
    public String getName(){
        return name;
    }
    
     public void setName(String name){
        this.name = name;
    }
    
}


