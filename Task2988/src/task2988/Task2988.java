/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2988;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;

public class Task2988 { 
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    //read input from user 
    System.out.print("Enter a number to display the Fibonacci series up to: "); 
    int n = scanner.nextInt();
    int t1 = 0, t2 = 1; // declares and initializes two integer variables t1 and t2 
    System.out.print("Fibonacci series up to " + n + ": "); // prints a message to the user indicating the Fibonacci series up to the entered number

    while (t1 <= n) { // starts a while loop 
      System.out.print(t1 + " "); // prints the current value of t1 followed by a space
      int sum = t1 + t2; // calculates the sum of t1 and t2 and stores it in a temporary variable sum
      t1 = t2; // assigns the value of t2 to t1
      t2 = sum; // assigns the value of sum to t2
    }
  }
}
