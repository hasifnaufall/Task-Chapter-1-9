/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class ArithmeticProg {

    public static void main(String[] args) {
        int num1, num2;
        int sum, difference, product, quotient, remainder;

        Scanner in = new Scanner(System.in);
        
        //Input first integer
        System.out.print("Enter the first integer: ");
        num1 = in.nextInt();

        //Input second Integer
        System.out.print("Enter the second integer: ");
        num2 = in.nextInt();

        // Perform arithmetic operations
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        remainder = num1 % num2;

        // Perform increment and decrement operations
        int incrementedNum1 = ++num1;
        int decrementedNum2 = --num2;

        // Display output
        System.out.println("Results of arithmetic operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Incremented first integer: " + incrementedNum1);
        System.out.println("Decremented second integer: " + decrementedNum2);

        // Close the scanner
        in.close();
    }
}
