/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task593;

/**
 *
 * @author Hasif
 */
public class GradeList {
    public char[] identifyGrades(int[] marks) {
        char[] grades = new char[marks.length];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 80) {
                grades[i] = 'A';
            } else if (marks[i] >= 70) {
                grades[i] = 'B';
            } else if (marks[i] >= 60) {
                grades[i] = 'C';
            } else if (marks[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'E';
            }
        }
        return grades;
    }
}
