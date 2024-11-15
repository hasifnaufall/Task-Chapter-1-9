/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise.pkg5;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class HighestAverage {
    public void PalingTinggi()
    {
      double HighAverage;
      Student1 myStudent1 = new Student1 ();
      Student2 myStudent2 = new Student2 ();
      Student3 myStudent3 = new Student3 ();
      
HighAverage = Math.max(Student1.listMark(), Math.max(Student2.listMark2(),mark3.listMark3()));

System.out.printf("Highest average is: %.2f\n", HighAverage);
    }
}
  