// CSC-151-O1
// Sterling Clark 
// 10/8/20

package ch07supplemental;

import java.util.Scanner;

public class Rusty2 {

 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter dealer cost of car : ");
            // parse String from sc object to double getRetailPrice method
            double dealerCost = Double.parseDouble(sc.next());  
            sc.nextLine();
            System.out.print("Enter cleaning cost: ");
            double cleaningCost = Double.parseDouble(sc.next());
            sc.nextLine();
            
            // output to display results
            System.out.println("The Retail Price of the car is: " + Dealership.getRetailPrice(dealerCost, cleaningCost));
            
            
        // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
    }
    
  }
}
