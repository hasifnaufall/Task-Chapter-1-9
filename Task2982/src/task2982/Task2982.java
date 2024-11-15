/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2982;

/**
 *
 * @author Hasif
 */
public class Task2982 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x = 0; // sum of power of two

    for (int i = 1; i <= 10; i++) {
      int y = i * i; // formula
      System.out.println("Power (" +i+ ")^2 =" + y);
      x += y;
    }

    System.out.println("\nTotal Sum of Power of Two: " + x);
  }
}