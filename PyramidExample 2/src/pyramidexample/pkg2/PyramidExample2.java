/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyramidexample.pkg2;

/**
 *
 * @author Hasif
 */
public class PyramidExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int term = 6;
        for (int i=1;i<=term;i++){
            for (int j = term;j>=i;j--){
                System.out.print("*");
            }
            
           System.out.println();
            }
        }
    }