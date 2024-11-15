/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;

/**
 *
 * @author Hasif
 */
import javax.swing.JOptionPane;

public class Addition {
    public void Dialog() {
        String name = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Welcome sahabatku " + name + " Lama tidak berjumpa", "Results", JOptionPane.PLAIN_MESSAGE);
    }

}