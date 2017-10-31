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
public class A2P7 {
     
    // Method that checks if a word is palindrome
    public boolean isPalindrome(String word){
        
    // Check if word is not equal to anything
    if (word == null){
        return false;

    // Check if the word length is equal to 0 or 1 - return true 
    }else if(word.length() == 0 ||word.length() == 1){
        return true;
    }

    // Checks if the first letter and the last letter are equal
    if (word.charAt(0) == word.charAt(word.length()-1)){
        return isPalindrome (word.substring(1, word.length() -1));
    }
    return false;
}
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Creating an object to run methods
        A2P7 test = new A2P7();
        
        // Calling the method and outputting the results
        Boolean isPalindrome = test.isPalindrome("racecar");
        System.out.println(isPalindrome );
    }
    
}
