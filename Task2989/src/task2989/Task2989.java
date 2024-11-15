/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2989;

import java.util.Scanner;

public class Task2989 {
  public static void main(String[] args) {
    // Input from user 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to display the Fibonacci series up to: ");
    int limit = scanner.nextInt();

    // Initialize the first two numbers in the Fibonacci series
    int firstNum = 0, secondNum = 1;
    // Print the header for the Fibonacci series
    System.out.print("Fibonacci series up to " + limit + ": ");
    // This program generates the Fibonacci series up to the user-input number
    while (firstNum <= limit) {
      // Print the current value of firstNum
      System.out.print(firstNum + " ");
      // Calculate the next number in the series by adding firstNum and secondNum
      int sum = firstNum + secondNum;
      // Update the values of firstNum and secondNum
      firstNum = secondNum;
      secondNum = sum;
    }
  }
}
