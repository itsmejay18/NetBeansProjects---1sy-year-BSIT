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
public class Student {
    private int Student_ID;
    private String Student_Name;
    private Double Grades;
    
    public int get_Student_ID() {
        return Student_ID;
    }
    public String get_Student_Name() {
        return Student_Name;
    }
    public Double get_Grades() {
        return Grades;
    }
    
    public void set_Student_ID(int ID) {
        this.Student_ID = ID;
    }
    public void set_Student_Name(String Name) {
        this.Student_Name = Name;
    }
    public void Add_Grade (Double Grade) {
        this.Grades = Grade;
    }
}
