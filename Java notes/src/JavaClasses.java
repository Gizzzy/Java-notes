/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class JavaClasses {
    int x = 6;
    // When you use the final word to declare the attribute, it cannot be overriden.
    final int y = 50;
    String myName = "Isaac G. Karimi";
    String myLocation = "Nyeri";
    int myAge = 21;
    
    public static void trial(){
        int x = 4;
        System.out.println(x);
        JavaClasses myObj2 = new JavaClasses();
        myObj2.myName = "Sam Gee";
        System.out.println(myObj2.x);
        System.out.println(myObj2.myName);
    }
    
    public static void trialTwo() {
        JavaClasses myObj = new JavaClasses();
        myObj.x = 40;
        System.out.println(myObj.x + ". " + myObj.myName);
        //System.out.println(myObj.myName);  
    }
    
    public static void changeAttribute() {
        JavaClasses myObj = new JavaClasses();
        JavaClasses myObj2 = new JavaClasses();
            myObj.x = 20;
            System.out.println(myObj.x);        
            System.out.println(myObj2.x);
    }
    
    public static void displayInfo() {
        JavaClasses myObject = new JavaClasses();
        System.out.println("Name: " + myObject.myName + 
                "\nAge: " + myObject.myAge + 
                "\nLocation: " + myObject.myLocation);
    }
    
    public static void main(String[] args) {
        //trial();
        //trialTwo();
        //changeAttribute();
        displayInfo();
        
        
    }
    
}
