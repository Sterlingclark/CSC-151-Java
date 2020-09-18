// CSC-151-Java Programing 
// Sterling Clark
// 9/17/20
package ch04_project1;

import java.util.Scanner;


public class Ch04_Project1 {
    static void printSquareRow(int x) {
//        System.out.println(x);
        int square = x * x;
        int cubed = x * x * x;
        System.out.println(x + "\t" + square + "\t" + cubed);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the squares and cubes table\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        System.out.print("Enter an integer:   ");
        int integer = sc.nextInt();
        System.out.println("Number\tSquared\tCubed");
        System.out.println("======\t=======\t=====");
        for (int i = 1; i <= integer; i++) {
             //add nuber to starting row
//             System.out.println(i);
            printSquareRow(i);
        //          String row = integer + "   ";  
        }
        
        
        
       
       
       
       
       
//       while (!choice.equalsIgnoreCase("n")) {
//           // get input from user
//           System.out.print("Enter an integer:   ");
//            int integer = sc.nextInt();
//           
//           // initialize the table variable
//           String table = "";
//           // create header row and add to table
//           String headerRow = "Number   Squared   Cubed";
//           
//           // loop through the numbers
//           for (int i = 1; i <= integer; i++) {
//               //add nuber to starting row
//               String row = integer + "   ";  
//           }
//           System.out.println();
//           System.out.println(table);
//           
//          // see if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println(); 
//       }
       
       
       
    }
    
}
