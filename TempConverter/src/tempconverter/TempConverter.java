// CSC-151-Java Programing
// Sterling Clark 
// 9/10/20

package tempconverter;

import java.text.NumberFormat;
import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        System.out.print("Welcome to the Temperature Converter");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            
            System.out.print("Enter degrees in Fahrenheit: ");
            double degree = sc.nextDouble();
            
            double celsiusTemp = (degree - 32) * 5/9;
            
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String celsiusTempString = number.format(celsiusTemp);
            
            System.out.print("Degrees in Celsius: " + celsiusTempString);
            System.out.println();
            
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();            
        }
        
    }
    
}
