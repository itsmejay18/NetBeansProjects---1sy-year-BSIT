/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num8;

/**
 *
 * @author user
 */
public class Num8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    person Person = new person();
    
    Person.setname("Kian");
    Person.setage(18);
    Person.setcountry("Nigeria");
    
        System.out.println("Name : " + Person.getname());
        System.out.println("Age : " + Person.getage());
        System.out.println("Country : " + Person.getcountry());
    }
    
}
