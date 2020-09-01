/*
 * 
 */
package project_2_2;

import java.util.Scanner;

/**
    * CSC-151-Java Programing
    * Sterling Clark
    * 8/31/20
    */
public class Project_2_2 {

    /**
    @param args the command line arguments
    */
    public static void main(String[] args) {
        // Welcome to the Grade Converter app
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the numerical grade from user
            System.out.print("Enter numerical grade:  ");
            double grade = sc.nextDouble();

            // calculate the letter grades for numeric values
            if (grade >= 88) {
                System.out.println("Letter Grade: A");
            } else if (grade >= 80) {
                System.out.println("Letter Grade: B");
            } else if (grade >= 67) {
                System.out.println("Letter Grade: C");
            } else if (grade >= 60) {
                System.out.println("Letter Grade: D");
            } else if (grade <= 59 ) {
                System.out.println("Letter Grade: F");
            }

            // see if the user wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
