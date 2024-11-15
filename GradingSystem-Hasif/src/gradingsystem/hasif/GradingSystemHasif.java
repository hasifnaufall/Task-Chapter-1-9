/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystem.hasif;
/**
 *
 * @author Hasif
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class GradingSystemHasif {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner Hasif = new Scanner(System.in);

        // Display greeting message
        JOptionPane.showMessageDialog(null, "Welcome to Grading System by Hasif");

        // Use a do-while loop to continue using the program
        do {
            // Read the number of students using Scanner
            int numStudents = getNumberOfStudents(Hasif);

            // Initialize a variable called passed to 0, which will count the number of students who passed.
            int passed = 0;

            // Initialize a string to accumulate the grades for each student
            String grades = "";

            // Use a for loop to iterate numStudents times, asking for the mark of each student.
            for (int i = 0; i < numStudents; i++) {
                int mark = getStudentMark(Hasif, i + 1);
                // Determine the grade and concatenate it to the grades string
                String grade = determineGrade(mark);
                grades += "Student " + (i + 1) + ": " + mark + "/100 Grade: " + grade + "\n";

                // Check if the mark is 40 or higher
                if (mark >= 40) {
                    passed++;
                }
            }

            // Calculate the number of students who failed
            int failed = numStudents - passed;

            // Prepare the result message
            String resultMessage = "Number of students who failed: " + failed + "\n" +
                                   "Number of students who passed: " + passed + "\n" +
                                   grades;

            // Check if more than 50% of the students passed. If so, add a bonus message.
            if ((float) passed / numStudents > 0.5f) {
                resultMessage += "\nBonus to instructor!";
            }

            // Show the result using JOptionPane
            JOptionPane.showMessageDialog(null, resultMessage);

            // Ask the user if they want to continue
            System.out.println("Do you want to continue using the program? (yes/no)");
        } while (Hasif.next().equalsIgnoreCase("yes")); // Continue if user says "yes"

        // Farewell message
        JOptionPane.showMessageDialog(null, "Thank you for using the Grading System by Hasif. Goodbye!");

        // Close the scanner
        Hasif.close();
    }

    // Method to get the number of students
    public static int getNumberOfStudents(Scanner Hasif) {
        System.out.print("Enter the number of students: ");
        return Hasif.nextInt();
    }

    // Method to get and validate the student's mark
    public static int getStudentMark(Scanner Hasif, int studentNumber) {
        int mark = -1;
        while (mark < 0 || mark > 100) {
            System.out.print("Enter mark for student " + studentNumber + " (0-100): ");
            mark = Hasif.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid! Please enter a value between 0 and 100.");
            }
        }
        return mark;
    }

    // Method to determine the grade based on the mark
    public static String determineGrade(int mark) {
        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else if (mark >= 45) {
            return "D";
        } else if (mark >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
}
