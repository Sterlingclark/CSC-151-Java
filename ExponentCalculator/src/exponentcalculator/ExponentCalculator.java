// CSC-151-Java Programing
// Sterling Clark 
// 9/10/20

package exponentcalculator;

import java.util.Scanner;

public class ExponentCalculator {


    public static void main(String[] args) {
        System.out.print("Welcome to the expont calculator");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter an interger: ");
            int integer = sc.nextInt();
            
            System.out.print("Enter the power: ");
            int power = sc.nextInt();
            
            double solution = Math.pow(integer, power);
            
            
            String message = integer + " to the power of " + power + " is " + Math.round(solution) + "\n";            
            System.out.println(message);

            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }        
        
    }
    
}
