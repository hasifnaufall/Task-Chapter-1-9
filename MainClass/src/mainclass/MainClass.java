/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainclass;

/**
 *
 * @author Hasif
 */
public class MainClass { //main 
    public static void main ( String args[]) 
    {
        GradeBook myGradeBook = new GradeBook(); //myGradeBook object
        myGradeBook.displayMessage();
    
        User myUser = new User();//user Class
        myUser.userName(); //userName method
        
        Addition myAddition = new Addition();
        myAddition.Dialog();
    }
}
