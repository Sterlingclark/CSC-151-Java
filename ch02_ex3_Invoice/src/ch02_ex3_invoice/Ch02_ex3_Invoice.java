/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02_ex3_invoice;

// CSC-151-Java Programing

import java.util.Scanner;

// Sterling Clark 
// 9/2/20 @author sterl

public class Ch02_ex3_Invoice {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // created variables for calculating averages
        double invoiceTotal = 0.0;
        double discountTotal = 0.0;
        int invoiceCount = 0;

        // perform invoice calculations until choice isn't equal to "n" or "N"
        String choice = "y";
        while (choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
            } else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            // calculate the invoice count and total
            invoiceTotal = invoiceTotal + total;
            discountTotal = discountTotal + discountAmount;
            invoiceCount = invoiceCount + 1;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }

        // Display message with invoice count and average discount
        String message = "Number of inboices: " + invoiceCount + "\n"
                        + "Average Invoice:   " + invoiceTotal / invoiceCount + "\n"
                        + "Average Discount:  " + discountTotal / invoiceCount + "\n";
        System.out.println(message);
        
    }
    
}
