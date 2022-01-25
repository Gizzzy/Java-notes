/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class JavaMethods {
    static void main(String myName) {
        //main() is the name of the method
        //static means that the method belongs ot the main class and not an pbject of th emain class.
        //void means that this method des not have a return value.
        //The string myName is called a parameter.
        System.out.println(myName + " Traversy");
    }
    
    static int myMethod(int x, int y) {
        return x - y;
    }
    
    public static void main(String[] args) {
        main("Brad");
        int z = myMethod(9, 5);
        System.out.println(z);
    }
}
