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
public class A2P2 {
    
    // This Problem gets the user to enter a number
    // And adds all of the digits together
    // digitalSum(126) = 9, 1 + 2 + 6 = 9
    
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
    
    // Method that gets the root of the sum of digits in a number
    public int digitalRoot(int n){
         
        // Calling the method digitalSum um to get the sum of the digits
        digitalSum(n);
        
            // If statement to see if n < 10 - return n
            if (n < 10){
                return n;
            }else{

            // Assigning a value to the variable square
            int square = 0;
            
            // Storing then getting rid of the last digit 
            square += digitalSum(n) % 10;   
                       
            // Returning the sum of the numbers entered
            return digitalRoot(digitalSum(n));
        }   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object to run methods
        A2P2 test = new A2P2();
        
        // Calling the method and outputting the results 
        int digitalRoot3 = test.digitalRoot(2019);
        System.out.println(digitalRoot3);
    }
}

