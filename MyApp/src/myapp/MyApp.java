// CSC-151-Java Programing
// Sterling Clark 
// 9/2/20
package myapp;

import java.util.Scanner;

/**
 *
 * @author sterl
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // welcome the user to the program
        System.out.println("Welcome to the Sterling co. paycheck calculator");
        System.out.println();  // print a blank line
        
        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the invoice subtotal from the user
            System.out.print("Enter PayCheck Amount:   ");
            double payCheckAmount = sc.nextDouble();

            // calculate paycheck amount and 
            double taxAmount;
            if (payCheckAmount >= 500) {
                taxAmount = .15;
            } else if (payCheckAmount >= 200) {
                taxAmount = .10;
            } else if (payCheckAmount >= 100) {
                taxAmount = .05;
            } else {
                taxAmount = 0.0;
            }
            double taxTaken = payCheckAmount * taxAmount;
            double total = payCheckAmount - taxTaken;
            
            // display the discount amount and total
            String message = "Tax Amount: " + taxAmount + "\n"
                           + "Tax Taken From Check:  " + taxTaken + "\n"
                           + "Take Home Amount:    " + total + "\n";            
            System.out.println(message);
            
            // see if the user wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.next();
            System.out.println();
            
        }    
    }
}

