/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskchapter4;

import java.util.Scanner;
public class TaskChapter4 {   
   /*public static void main(String[] args) {
    // Set password
    String password = "password123";
    // Set max attempts
    int maxAttempts = 3;
    // Create Scanner object
    Scanner scanner = new Scanner(System.in);
    // Initialize attempts counter
    int attempts = 0;
    // Start password input loop
    while (attempts < maxAttempts) {
      // Ask for password
      System.out.print("Enter password: ");
      // Read input
      String input = scanner.nextLine();
      // Check if input matches password
      if (input.equals(password)) {
        // Grant access
        System.out.println("Access granted!");
        break;
      } else {
        // Increment attempts counter
        attempts++;
        // Print attempts remaining
        System.out.println("Incorrect password. Attempts remaining: " + (maxAttempts - attempts));
      }
    }
    // Check if max attempts exceeded
    if (attempts == maxAttempts) {
      // Print max attempts exceeded message
      System.out.println("Maximum attempts exceeded. Exiting...");
    }
  }
}*/
    
/*public static void main(String[] args) {
    // read input from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    // read integer from user and store it
    int numStudents = scanner.nextInt();
    int passed = 0;
    // Use a for loop to iterate numStudents
    for (int i = 0; i < numStudents; i++) {
      System.out.print("Enter mark for student " + (i + 1) + " ( /100): ");
      // Read an integer from the user and store it
      int mark = scanner.nextInt();
      // Check if the mark is 50 or higher
      if (mark >= 50) {
        passed++;
      }
    }
    // Calculate the number of students who failed by subtracting the number of students who passed from the total number of students.
    int failed = numStudents - passed;
    // Print the number of students who failed.
    System.out.println("Number of students who failed: " + failed);
    // Print the number of students who passed.
    System.out.println("Number of students who passed: " + passed);
    // Check if more than 50% of the students passed.
    if ((float) passed / numStudents > 0.5f) {
      System.out.println("Bonus to instructor!");
    }
  }
}*/
    

/*public static void main(String[] args) {
    // Input from user
    Scanner scanner = new Scanner(System.in);
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
    System.out.println("Total sales: RM" + totalSales);
    System.out.println("Sales commission: RM" + commission);
    System.out.println("Salesman's earnings for this week: RM" + earnings);
  }
}*/
    

/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice; // integer input for choice
    do {
      System.out.println("------------------------------------");
      System.out.println("|          Welcome to All IT        |");
      System.out.println("------------------------------------");
      System.out.println("|         List of beverages         |");
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
      // Ask user if they want to continue
      System.out.print("Do you want to continue? (1 for yes, 0 for no): ");
      choice = scanner.nextInt();
    } while (choice == 1);
    System.out.println("Thank you for choosing our shop!");
  }
}*/
    
/*public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    //read input from user 
    System.out.print("Enter a number to display the Fibonacci series up to: "); 
    int n = scanner.nextInt();
    int t1 = 0, t2 = 1; // declares and initializes two integer variables t1 and t2 
    System.out.print("Fibonacci series up to " + n + ": "); // prints a message to the user indicating the Fibonacci series up to the entered number

    while (t1 <= n) { // starts a while loop 
      System.out.print(t1 + " "); // prints the current value of t1 followed by a space
      int sum = t1 + t2; // calculates the sum of t1 and t2 and stores it in a temporary variable sum
      t1 = t2; // assigns the value of t2 to t1
      t2 = sum; // assigns the value of sum to t2
    }
  }
}*/
    
  /*public static void main(String[] args) {
    int n = 5; // set the value of n
    int factorial = 1; // initialize factorial variable to 1

    for (int i = 1; i <= n; i++) { // start loop from 1 to n
      factorial *= i; // multiply factorial by current number
    }
    System.out.println("The factorial of " + n + " is: " + factorial); // print result
  }
}*/
    

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // create a scanner to read user input
    System.out.print("Enter a number: "); // prompt user to enter a number
    int n = scanner.nextInt(); // read the input number
    int factorial = 1; // initialize factorial variable to 1
    for (int i = 1; i <= n; i++) { // start loop 
      factorial *= i; // multiply factorial by current number
    }
    System.out.println("The factorial of " + n + " is: " + factorial); 
  }
}
