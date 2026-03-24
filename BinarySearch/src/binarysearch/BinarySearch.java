/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of the Array : ");
    int size = sc.nextInt();
    
    int [] myArray = new int[size];
    
    System.out.println("Enter Elements For The Array : ");
    for (int i = 0; i < myArray.length;i++){
        myArray[i] = sc.nextInt();
    }
    System.out.println("Enter First Element To Find: ");
    int firstFind = sc.nextInt();
    System.out.println("Enter Second Element To Find: ");
    int secondFind = sc.nextInt(); 
    int firstIndex = -1;
    int secondIndex = 1;
    for (int i = 0; i < myArray.length; i++) {
        if (myArray[i] == firstFind) {
            firstIndex = i;
        }
        if (myArray[i] == secondFind) {
            secondIndex = i;
        }
    }
        System.out.println("Index of first element: " + firstIndex);
        System.out.println("Index of second element: " + secondIndex);
        }
}
