/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task593;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class Task593 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[10], counts;
        char[] grades;

        System.out.println("Enter 10 marks:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        GradeList gradeList = new GradeList();
        grades = gradeList.identifyGrades(marks);

        GradeType gradeType;
        gradeType = new GradeType();
        counts = gradeType.countGrades(grades);

        System.out.println("Out of 10:");
        System.out.println("Grade A: " + counts[0]);
        System.out.println("Grade B: " + counts[1]);
        System.out.println("Grade C: " + counts[2]);
        System.out.println("Grade D: " + counts[3]);
        System.out.println("Grade E: " + counts[4]);

        input.close();
    }
}

   