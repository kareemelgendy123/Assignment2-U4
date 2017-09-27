/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmentjava.recursions;

/**
 *
 * @author Kareem
 */
public class A2P5 {
    
    // Method that converts a decimal number (n) to binary
    public String binaryConvert(int n){
        
        // If statement that checks if n == 0 or 1 and returns n
        if (n == 0){
            //Returning a value of n
            return "" + n;
            
        }else{
            // Printing n
            System.out.println(n);
            
            // Creating a variable that gets the remainder
            int binary = 0;
            binary += n%2;
            
            // Returning a value of n/2 + the remainder
            return binaryConvert(n/2) + binary;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object that runs methods
        A2P5 test = new A2P5(); 
        
        // Calling the binaryConvert method, and outputting it
        String binaryConvert = test.binaryConvert(156);
        System.out.println("The binary number is " + binaryConvert);
      
    }
    
}
