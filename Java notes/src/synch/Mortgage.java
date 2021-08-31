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
public class Mortgage {
    
    public static double enteredInformation(){
        Scanner enterPrinciple = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = enterPrinciple.nextDouble();
        
        System.out.print("Rate: ");
        double rate = enterPrinciple.nextDouble();
        
        System.out.print("Period: ");
        double Period = enterPrinciple.nextDouble();
        
        return (rate);
    }
    
    public static void calculate(double rate){
        double addition = 1 + (rate / 100);
        
    }

    public static void main(String[] args) {
        enteredInformation();
        
    }
    
}
