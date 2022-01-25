/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class JavaModifiers {
    /* A static method means that it can be accessed without creating an object
    of the class, unlike public */
    // Static method
    static void myStaticMethod() {
        System.out.println("static methods can be called wothout creating objects");
    }
    
    //public method
    public void myPublicMethod() {
        System.out.println("Public method must be called by creating object");       
    }
    
    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error
        
        JavaModifiers myObj = new JavaModifiers(); // Creating an object of Main
        myObj.myPublicMethod(); // Call the public method
    }
    
}
