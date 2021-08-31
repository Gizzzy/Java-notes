
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class FizzBuzz {
    //If divisible by 5 - Fizz
    //If divisibl by 3 - Buzz
    //If divisible by both 3 and 5 - FizzBuzz
    
    public static void fizzBuzz(){
        Scanner number = new Scanner(System.in);
            System.out.print("Enter a number: ");
        int enteredNumber = number.nextInt();
        
        if (enteredNumber % 3 == 0 && enteredNumber % 5 == 0)
            System.out.println("FizzBuzz");
        
        else if (enteredNumber % 3 == 0)
            System.out.println("Buzz");
        
        else if (enteredNumber % 5 == 0)
            System.out.println("Fizz");
        
        else 
            System.out.println(enteredNumber);
                
    } 
    
    public static void main(String[] args) {
            fizzBuzz();
 

    }
}
