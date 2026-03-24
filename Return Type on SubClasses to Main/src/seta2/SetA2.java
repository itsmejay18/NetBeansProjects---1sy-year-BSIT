/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seta2;

/**
 *
 * @author user
 */
public class SetA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Student st = new Student();
        
        st.set_Student_ID(12);
        st.set_Student_Name("Kian Villaluz");
        st.Add_Grade(99.0);
        
        System.out.println("Student ID : "+ st.get_Student_ID());
        System.out.println("Student Name : "+ st.get_Student_Name());
        System.out.println("Student Grades : "+ st.get_Grades());
        
    }
    
}
