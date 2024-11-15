/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 *
 * @author Hasif
 */
public class Shape {

    public static void main(String[] args) {
        int height = 10; 
        
        //  "H"
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                //  "H"
                if (j == 0 || j == height - 1 || i == height / 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            
            
            System.out.print("  ");
            
            //  "N"
            for (int j = 0; j < height; j++) {
                
                if (j == 0 || j == height - 1 || j == i) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
