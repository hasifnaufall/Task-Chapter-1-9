/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Input Current Year
        System.out.print("Enter Current Year: ");
        int num1 = in.nextInt();
        
        //Input Birth Year
        System.out.print("Enter Your Birth Year: ");
        int num2 = in.nextInt();
        
        //Calculate age
        int age = num1 - num2;
        
        //Dsiplay Output
        System.out.println("Your Age is: "+age);
    }
    
}

