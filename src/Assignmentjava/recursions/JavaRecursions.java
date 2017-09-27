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
public class JavaRecursions {
    
    // Recursion Rules
    // Function must make a call to itself
    // Must have a base case
    // Each step must go closer to the base case
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int digits = 3;
        int sum = 0;
        int n = 126;
        
        for (int i = 0; i < digits; i++){
        // If statement to see if n < 10
        if (n < 10){
            n = n;
            
        }else{ 
        // Adding the rightmost digit
        n /= 10;

            sum += n % 10;
            // Getting rid of the last digit 
        }
        }
        
        System.out.println(sum);
    }
    
}
