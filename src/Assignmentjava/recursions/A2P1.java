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
public class A2P1 {
   
    // This Problem gets the user to enter a number
    // And adds all of the digits together
    // the adds the digits of the sum to get the square root
    // digitalRoot(2019) = 3
    
    // Method that gets the sum of the digits in a number
    public int digitalSum(int n){
        
        // If statement to see if n < 10
        if (n < 10){
            return n;
            
        }else{ 
            // Assigning a value to the variable
            int sum = 0;
            
            // Storing then getting rid of the last digit 
            sum += n%10;            
            
            // Returning the sum of the numbers entered
            return digitalSum(n/10) + digitalSum(sum);
        }  
    }

        


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating a method that runs the methods
        A2P1 test = new A2P1();
        
        // Calling the digitalSum method and outputting the results
        int digitalSum = test.digitalSum (126);
        System.out.println(digitalSum);
        
        
        
    }

    
}
