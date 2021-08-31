/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class Trial {

    /**
     * @param args the command line arguments
     */

    public static void enteredInformation(){
        Scanner enterPrinciple = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = enterPrinciple.nextDouble();
        
        System.out.print("Rate: ");
        double rate = enterPrinciple.nextDouble();
        //double calculation = calculate(rate);
        
        System.out.print("Period: ");
        double Period = enterPrinciple.nextDouble();
  
    }
    
    public double calculate(double rate){
        double addition = 1 + (rate / 100);
        return addition;
    }
    
    public static void grade(){

    }
    
    public static void main(String[] args) {
                grade();
    }
    
}
