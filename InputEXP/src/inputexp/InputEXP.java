/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputexp;

/**
 *
 * @author Hasif
 */
import java.util.Scanner;
public class InputEXP {
    
    public static void main(String[] args) {
        String name;
        int age;
        String hobby;
        String favorite_food;
        
        Scanner on = new Scanner(System.in);
        
        //Input Name
        System.out.println("Insert Name :");
        name = on.nextLine ();
        
        //Input Age 
        System.out.println("Insert Age :");
        age=on.nextInt();
        
        //Input Hobby
        on.nextLine ();
        System.out.println("Insert Hobby :");
        hobby = on.nextLine ();
        
        //Input Favorite Food
        System.out.println("Insert favorite_food :");
        favorite_food = on.nextLine ();
        
        //Close Scanner
        on.close();
        
        //Display Output
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("hobby :"+hobby);
        System.out.println("favorite_food :"+favorite_food);
        
    }
    }



