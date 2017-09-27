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
public class A2P3 {
    
    // Method that find number of blocks in a triangle row
    public int triangle(int n){
        
        // If statement to see if n = 0 or 1 - return n
        if (n == 0 || n == 1){
            return n;
        
        }else{
            // Returning the value 
            return n + triangle(n-1);
        }   
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object to run methods
        A2P3 test = new A2P3();
        
        // Calling the method and outputting the results
        int triangle = test.triangle(5);
        System.out.println(triangle);

    }
    
}
