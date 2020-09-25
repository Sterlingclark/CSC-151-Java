// CSC-151-O1
// Sterling Clark 
// 9/22/20

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {
    
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + limit);
        System.out.println();
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;   // d is >= 0.0 and < limit
        int randomInt = (int) d;            // convert double to int
        randomInt++;                        // int is >= 1 and <= limit
        return randomInt;
    }

    public static void main(String[] args) {
        final int LIMIT = 100;
        
        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        Scanner sc = new Scanner(System.in);            
        int count = 1;
        while (true) {
            System.out.print("Your guess: ");
            
            int guess = 0;
            
//            try {
//               guess = sc.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Error! Invalid number. Try again.\n");
//                sc.nextLine(); //discard all data entered by the user
//                continue; // go to the top of the loop
//            }

            if (sc.hasNextInt()) {
                guess = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Error! Invoid number. Try again.");
                sc.nextLine();
                continue;
            }
            
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            // add message for if guess is within 10 digits
            if (guess < number + 10 && guess > number - 10) {
                System.out.println("Your are getting hot!");
            }
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + 
                                   count + " tries.\n");
                break;
            }            
            count++;
        }
        System.out.println("Bye!");
    }   
}