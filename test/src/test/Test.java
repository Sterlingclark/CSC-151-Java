/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author sterl
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int items = 3;
        for (int i = 1; i <= items; i++) {
        int result = 1;
        for (int j = i; j >= 1; j--) {
        result *= j;
    }
    System.out.println("Factorial " + i + " = " + result);
}
 
    }
    
}
