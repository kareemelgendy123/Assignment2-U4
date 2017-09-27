/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class A2P6 {

    /**
     * @param args the command line arguments
     */
    
    // Method that converts a number to any given base
    public String convert(int n, int b){
        
        // String variable that stores the words
        String number = new String();
        // Array that holds a letter for each number greater than 10
        String [] letters = {"A", "B", "C", "D", "E", "F"};
        
        // If statement that checks if the remainder is less than or equal to 10
        // Gets the letter 
        if (n % b >= 10){
            number += letters[n % b - 10];
        
        // If statement that checks if the remainder is:
        // greater than or equal to 2
        // Or less than 10
        // Then adds them to the up to the veriable number
        }else if (n % b >= 2 || n % b < 10){
            number += n % b;         
        }
        
        // If statement that checks if the number = 0 then returns number
        if (n / b == 0){
            return number;
        }
        
        // Returning the value of the variable output
        String output = convert(n / b, b) + number;
        return output;

    }
    
    public static void main(String[] args) {
        
        // Creating an object to run methods
        A2P6 test = new A2P6();
        
        // Calling the method and outputting the result
        String convert = test.convert(1000, 16);
        System.out.println(convert);
        
    }
    
}
