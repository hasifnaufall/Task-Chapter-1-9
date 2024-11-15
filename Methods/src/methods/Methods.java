/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author Hasif
 */
public class Methods {
    public static void main(String[] args) {
        Methods methods = new Methods(); 
        methods.init();
    }

    public static void init() {
        double number1 = 11.11;
        double number2 = 22.22;
        double number3 = 33.33;
        double max = maximum(number1, number2, number3); 
        System.out.println("Max value: " + max);
    }

    public static double maximum(double x, double y, double z) {
        return Math.max(x, Math.max(y, z));
    }
}
       


