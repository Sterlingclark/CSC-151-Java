// CSC-151-Java Programing 
// Sterling Clark
// 9/17/20
package ch04_project1;

import java.util.Scanner;


public class Ch04_Project1 {

    public static void main(String[] args) {
        System.out.println("Welcome to the squares and cubes table\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

        System.out.print("Enter an integer:   ");
        int integer = sc.nextInt();
        System.out.println();
        String table = "";
        table += "Number\tSquared\tCubed\n";
        table += "======\t=======\t=====\n";
        
        for (int i = 1; i <= integer; i++) {
            int square = i * i;
            int cubed = i * i * i;
            table += i + "\t" + square + "\t" + cubed + "\n";
        }
        
        System.out.println(table);
        
        // see if the user wants to continue
        System.out.print("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
       } 
    }
}
