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
public class A2P4 {
    
    // Creathing a method that returns the hailstone pattern
    public int hailstone(int n){
        
        // If statement that checks if n == 0 or 1 then returns n
        if (n == 0 || n == 1){
            return n;
            
        // If statement that checks if n is even    
        }else if(n%2 == 0){
            // Printing the value of n
            System.out.println(n);
            // Returning the value of even n
            return hailstone(n/2);
            
        // Odd n
        }else{
            // Printing the value of n
            System.out.println(n);
            // Returning the value of an even n (no longer odd)
            return hailstone(3 * n + 1);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object to run methods
        A2P4 test = new A2P4();
        
        // Running the method and outputting the hailstone sequence
        int hailstone = test.hailstone(6);
        System.out.println(hailstone);
    }
    
}
