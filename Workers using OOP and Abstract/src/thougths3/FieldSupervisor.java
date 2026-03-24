package thougths3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class FieldSupervisor extends Workers {

    void calcuatingbonuses (){
        bonus = salary * .50;
        System.out.println("Salary: "+ salary);
        System.out.println("Bonus: " + bonus);
    }
    void generatingperformancereports () {
        System.out.println("Performance: Outstanding");
    }
    void managingprojects () {
        System.out.println("Managing " + name + " Projects");
        System.out.println("");
    }
    
}
