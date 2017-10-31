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
public class RecursionQuiz {
    
    // Method that takes a word and reverses it
    public String reverseString(String word){
        
        String newWord;
        int position = word.length() - 1;       

        if (word.length() <= 1){
            return word;
        
        }else if (word.length() > -1){
            
                newWord = "" + word.charAt(word.length()-1);
                position --;
                
                return newWord + "" + word.charAt(position);
        }
        return word + "" + word.charAt(position);
}
    
    
    public static void main(String[] args) {
        
        // Creating an object to run methods
        RecursionQuiz test = new RecursionQuiz();
        
        //Calling the method and outputting the results
        String reverseString = test.reverseString("computer");
        System.out.println(reverseString);
        
        
        
    }
    
}
