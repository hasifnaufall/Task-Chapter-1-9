/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task593;

/**
 *
 * @author Hasif
 */
public class GradType {
    public int[] countGrades(char[] grades) {
        int[] counts = new int[5];
        for (char grade : grades) {
            switch (grade) {
                case 'A':
                    counts[0]++;
                    break;
                case 'B':
                    counts[1]++;
                    break;
                case 'C':
                    counts[2]++;
                    break;
                case 'D':
                    counts[3]++;
                    break;
                case 'E':
                    counts[4]++;
                    break;
                default:
                    System.out.println("Invalid grade: " + grade);
                    break;
            }
        }
        return counts;
    }
}


