// CSC-151-O1
// Sterling Clark 
// 9/21/20

package diceroller;

import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        
        //message to introduce program
        System.out.println("Dice Roller");
        System.out.println();
        
        //create scanner object 
        Scanner sc = new Scanner(System.in);
        
        //see if the user wants to roll
        String choice = getUserChoice(sc, "Roll the dice? (y/n): ");
        
        
        // continue until choice isn't equal to y
        while (choice.equalsIgnoreCase("y")) {
            
            int die1 = rollDie();
            int die2 = rollDie();
            PrintDice(die1, die2);
            int total = die1 + die2;
            
            // display special message if die 1 and 2 match and equal 1 or 6. 
            // wasn't sure if you were wanting these to be their own methods or not I will refactor it if needed. 
            if (die1 == 1 && die2 == 1) {
                System.out.println("Snake eyes!");
            } 
            if (die1 == 6 && die2 == 6) {
                System.out.println("Boxcars!");
            }
            
            
            System.out.print("Total: " + total);
            System.out.println();
            // see if the user wants to continue 
            
            choice = getUserChoice(sc, "Roll again? (y/n): ");
        }
        System.out.println("Bye!");
    }
    
    
    // implement getUserChoice method
    private static String getUserChoice(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.next();
    }  
    
    // implement rollDie method
    public static int rollDie() {
        int dieRoll = (int) (Math.random() * 6) + 1;
        return dieRoll;
    }
    
    // implement printDice method  

    private static void PrintDice(int die1, int die2) {
        System.out.print("Die 1: " + die1);
        System.out.println();
        System.out.print("Die 2: " + die2);
        System.out.println();
    }  
}
        
