/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1582;

/**
 *
 * @author Hasif
 */
public class Task1582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using For loop
        int sumFor = 0;
        for (int x = 1; x <= 10; x++) {
            sumFor += x;
        }
        System.out.println("Sum using For loop: " + sumFor);

        // Using While loop
        int sumWhile = 0;
        int y = 0;
        while (y <= 10) {
            sumWhile += y++;
        }
        System.out.println("Sum using While loop: " + sumWhile);

        // Using Do-While loop
        int DoWhile = 0;
        int z = 0;
        do {
            z += DoWhile++;
        } while (DoWhile <= 10);
        System.out.println("Sum using Do-While loop: " + z);
    }
}

