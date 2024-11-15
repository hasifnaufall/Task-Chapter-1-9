/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise.pkg5;

/**
 *
 * @author Hasif
 */
import util.java.Scanner;
public class Student1 {
    double mark, total = 0;
    double average1;
    Scanner input = new Scanner (Scanner.in);
    System.out.println("Student 1");
    for (double num = 1; num <=3; num++){
    System.out.print("Enter mark " + num + ":");
    mark = input.nextInt();
    total +- mark;
}
 average1 = (double)total / 3;
 System.out.printf("Average mark 1 ; %.2f", average1)
