
import java.text.NumberFormat;
import java.util.Arrays;
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
public class Notes {
    
    public static void pritimitiveTypes() {
        int age = 30;
            age = 35;
        long myAge = 12334243L;
        double price = 34.90;
        float size = 45.67F;
        char letter = 'Q';
        boolean overage = true;
         
    }
    public static void referenceTypes(){
        int x = 1;
        int y = x;
            x = 4;
        //point pint1= new Point(1);
    }       
        
    public static void strings(){
        String letter = "Name:"+ "Isaac Gilbert";
        String name = "Name:"+ "Isaac Gilbert";
            System.out.println(name.length());        
            //name.indexof
            //name.replace(target:"r", replacement:"R")
            //name.endswith
            //name.startswith
            //name.tolowercase
            //name.touppercase
            //name.trim
    }
    
    public static void scapeSequences(){
       String gretings = "Hello \"Isaac\"";
       String tab = "\nHello Isaac";
       String next = "Hello \tIsaac";
        System.out.println(gretings);       
        
    }
    
    public static void arrays(){
       int[] numbers = new int[5];
            numbers[0] = 4;
            numbers[1] = 7;
            numbers[2] = 9;
            numbers[3] = 0;
        System.out.println(Arrays.toString(numbers));
        
        int[] digits = {1, 2, 4, 7, 8};
            System.out.println(Arrays.toString(digits));        
    }
    
    public static void constants(){
            //Constants should be in captal letters.
        final float PI = 3.142F;
        
        double division = (double)10 / (double)3;
        int h = 2;
        int t = h++; //Value of t = 2
        int r = ++h; //Value of r = 3
        
        int result = (int) Math.round(Math.random() * 100);
        String convert = NumberFormat.getCurrencyInstance().format(122113.332);
    }
    
    public static void scanner(){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Name: ");
        String name = scanner.nextLine().trim();
            System.out.println("Your name is " + name);
        
    }
    
    public static int parametersReturningvalues(int a, int b){
        //Parameters are the input the function needs in order to operate.
        //The values passed to that function are called arguments.
        
        //System.out.println(a + b);
        return (a + b); 

    }
    
    public static void returning(){
        int sum = parametersReturningvalues(232, 423);
        int result = sum * 14;
            System.out.println(result);
        
    }
    
    public static void Operators(){
        int x = 1;
        int y = 1;
            System.out.println(x == y);
                          //(x != y);  ! - Means not
                          // % - Means remainder after dividing.
                          
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
            System.out.println(isWarm);
        
        boolean hasHighIncome = true; 
        boolean hasGoodCredit = true;
        boolean hasCriminalRecords = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecords;
            System.out.println(isEligible);
        
            
    }
    public static void ifStatement(){
        int temp = 12;
        if(temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if(temp > 20 && temp <= 30)
            System.out.println("It's a beautiful day");  
        else 
            System.out.println("It,s a cold day");        
         
    }
    
    public static void switchStatement(){
        String role = "Admin";
        
        switch (role){
            case "Admin":
                System.out.println("You are an Admin");
                break;
                
            case "Moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
        }
        
        Scanner employeeGrade = new Scanner (System.in);
            System.out.print("Enter your grade: ");
        String enteredGrade = employeeGrade.nextLine().toUpperCase();
        
        if (enteredGrade == null)
            System.out.println("The employee does not exist");
        else switch (enteredGrade) {
            case "A":
                System.out.println("Your payment per hour is 500");
                break;
            case "B":
                System.out.println("Your payment per hour is 700");
                break;
            case "C":
                System.out.println("Your payment per hour is 1000");
                break;
            default:
                System.out.println("The employee does not exist");
                break;
        }
                
    } 
    
    public static void loops(){
        for (int i = 0; i < 5; i++)
            System.out.println("I need soup");
        
        for (int k = 5; k > 0; k--)
            System.out.println("I i'm not a student");
        
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input: ");
        input = scanner.next().toLowerCase();
        if (input.equals("quit"))
              break;
            System.out.println(input);
        }
        do{
            System.out.print("Input: ");
        input = scanner.next().toLowerCase();
            System.out.println(input);        
        }
        while (!input.equals("quit"));
    }
    
    public static void breakAndContinue(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.print("Input: ");
        input = scanner.next().toLowerCase();
        if (input.equals("pass"))
              continue;
        if (input.equals("quit"))
              break;
            System.out.println(input);
        }   
        
    }
    public static void forEachLoop(){
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        
        for (String fruit : fruits)
            System.out.println(fruits);
    }
    
    public static int payment(){
        Scanner grade = new Scanner(System.in);
        String enteredGrade = "";
        int grossPaymentOfA = 0;
        int grossPaymentOfB = 0;
        int grossPaymentOfC = 0;
        
        while (true){
            System.out.print("Enter your employee grade: ");
        enteredGrade = grade.nextLine().toUpperCase();
        if (enteredGrade.equals("A") || enteredGrade.equals("B") || enteredGrade.equals("C"))
            break;
        System.out.println("The employee does not exist.");
        }
            System.out.print("Enter the number of hours worked. ");
        int hoursWorked = grade.nextInt();
        
        switch (enteredGrade){
            case "A":
        grossPaymentOfA = (hoursWorked * 500) + 10000;
            System.out.println(grossPaymentOfA);
            break;
            
            case "B":
        grossPaymentOfB = (hoursWorked * 700);  
            System.out.println(grossPaymentOfA);
            break;
            
            default:
        grossPaymentOfC = (hoursWorked * 700) + 10000; 
            System.out.println(grossPaymentOfC);
        }
        return grossPaymentOfA;
        //return grossPaymentOfB;
        //return grossPaymentOfC;        
        
    }
    
    public static void displayPerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
            System.out.println(perimeter); // -> depends on the values of length and width
    }
    
    public static int returnStatement(int x) {
        return 5 + x;
    }
    /*
    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
    */
    
    public static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    /*
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
    */
    public static void main(String[] args) {
            displayPerimeter(3, 4);
        
    }
}
