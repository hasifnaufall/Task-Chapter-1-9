/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task298;

/**
 *
 * @author Hasif
 */
public class Task298 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x = 0; // even numbers
    int y = 0; // odd numbers

    // Calculate and divide even and odd
    System.out.println("Even numbers from 0 to 10:");
    for (int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
      x += i;
    }
    System.out.println("Odd numbers from 0 to 10:");
    for (int i = 1; i <= 10; i = i + 2) {
      System.out.println(i);
      y += i;
    }
    
    //Total
    System.out.println("Total Sum of Even Numbers :" + x);
    System.out.println("Total Sum of Odd Numbers :" + y);
}
}


    
   
