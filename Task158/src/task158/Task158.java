/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task158;

/**
 *
 * @author Hasif
 */
public class Task158 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Loop
        System.out.println("Printing Numbers from 1 to 10 (For)");
        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }

        // While 
        int countWhile = 1;
        System.out.println("Printing Numbers from 1 to 10 (While)");
        while (countWhile <= 10) {
            System.out.println(countWhile++);
        }

        // DoWhile
        int countDoWhile = 1;
        System.out.println("Printing Numbers from 1 to 10 (DoWhile)");
        do {
            System.out.println(countDoWhile++);
        } while (countDoWhile <= 10);
    }
}



      
