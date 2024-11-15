/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task592;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class Item {
 public void displayItem(){
    // Input from user
    Scanner scanner = new Scanner(System.in);
    // Print welcome message
    System.out.println("------------------------------------");
    System.out.println("|          Welcome to All IT        |");
    System.out.println("------------------------------------");
    System.out.println("|            List of item           |");
    System.out.println("|   1. Monitor        : RM 250.00   |");
    System.out.println("|   2. CPU            : RM 750.00   |");
    System.out.println("|   3. GPU            : RM 1200:00  |");
    System.out.println("_____________________________________");
    System.out.println("");
    // Ask for number of monitors sold
    System.out.print("Enter the number of monitors sold: ");
    int monitors = scanner.nextInt();
    // Ask for number of CPUs sold
    System.out.print("Enter the number of CPUs sold: ");
    int cpus = scanner.nextInt();
    // Ask for number of GPUs sold
    System.out.print("Enter the number of GPUs sold: ");
    int gpus = scanner.nextInt();
    // Set monitor price
    float monitorPrice = 250;
    // Set CPU price
    float cpuPrice = 750;
    // Set GPU price
    float gpuPrice = 1200;
    // Calculate total sales
    float totalSales = (monitors * monitorPrice) + (cpus * cpuPrice) + (gpus * gpuPrice);
    // Calculate commission
    float commission = totalSales * 0.05f;
    // Calculate earnings
    float earnings = 600 + commission;
    // Print total sales
    System.out.println("Total sales: RM" + totalSales);
    // Print sales commission
    System.out.println("Sales commission: RM" + commission);
    // Print salesman's earnings
    System.out.println("Salesman's earnings for this week: RM" + earnings);
  }
}
