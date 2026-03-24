/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thougths3;

/**
 *
 * @author user
 */
public class Thougths3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    FieldSupervisor F = new FieldSupervisor();
    Senior S = new Senior ();
    Junior J = new Junior ();
    
    System.out.println("Performace            Bonus");
    System.out.println("Outstanding             50%");
    System.out.println("Average                 25% ");
    System.out.println("Poor                     0%");
        System.out.println();
    
    
    F.name = "Ambrosyo";
    F.address = "prk.tinago, sitio dimakita";
    F.salary = 7999;
    F.jobTitle = "embalmer";
    F.calcuatingbonuses();
    F.generatingperformancereports();
    F.managingprojects();
    
    S.name = "Constatina";
    S.address = "ila mimi";
    S.salary = 6999;
    S.jobTitle = "mamarangay";
    S.calcuatingbonuses();
    S.generatingperformancereports();
    S.managingprojects();
    
    J.name = "Joselito";
    J.address = "1st district, kanto tiño";
    J.salary = 10;
    J.jobTitle = "tambay";
    J.calcuatingbonuses();
    J.generatingperformancereports();
    J.managingprojects();
    
    
    
    

    }
        
}
