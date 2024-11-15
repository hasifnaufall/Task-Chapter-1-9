/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task594;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class displayFormula {
    public void pilihanFormula() {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose your converter :   ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Insert Temperature in Celsius: ");
            float celsius = input.nextFloat();
            float fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("\n" + celsius + " C = " + fahrenheit + " F");
        } else if (choice == 2) {
            System.out.print("Insert Number (Meter): ");
            float meter = input.nextFloat();
            float kilometer = meter / 1000;
            System.out.println("\n" + meter + " meters = " + kilometer + " kilometers.");
        } else if (choice == 3) {
            System.out.print("Insert Number (Megabyte): ");
            float megabyte = input.nextFloat();
            float gigabyte = megabyte / 1024;
            System.out.println("\n" + megabyte + " MB = " + gigabyte + " GB.");
        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}