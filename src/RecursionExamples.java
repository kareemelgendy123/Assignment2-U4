/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class RecursionExamples {
    
    // Recursion Rules
    // Function must make a call to itself
    // Must have a base case
    // Each step must go closer to the base case
    
    // Method that returns the nth fibonacci number using a loop
    // n - the nth number we want in the sequence
    public int fibLoop (int n){
        
        // Array to store teh sequence
        int[] numbers = new int [n+1];
       
        numbers[0] = 1;
        
        // Boundary fixing
        if (n > 0){
            numbers[1] = 1;
        }
        
        // For loop that builds the sequence
        for (int i = 2; i < n+1; i ++){
            
            numbers[n] = numbers[i-1] + numbers[i+1];

        }
        
        // Returning the number
        return numbers[n];
    }
    
    // Method that returns the nth fibonacci number using recursion
    // n - the nth number we want in the sequence
    public int fibR(int n){
        
        // Base Case 
        if (n == 0 || n == 1){
            return 1;
        }else{
            return fibR(n-1) + fibR(n-2);
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RecursionExamples test = new RecursionExamples();
        
        // Loops
        int bound1 = test.fibLoop(0);
        System.out.println("0th: " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1st: " + bound2);
        int norm = test.fibLoop(5);
        System.out.println("5th: " + norm);
        
        System.out.println("----------");
        
        // Recursions
        int boundR1 = test.fibR(0);
        System.out.println("0th: " + boundR1);
        int boundR2 = test.fibR(1);
        System.out.println("1st: " + boundR2);
        int normR = test.fibR(6);
        System.out.println("6th: " + normR);
        

    }
    
}
