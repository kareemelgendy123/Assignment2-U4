/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class EuclideanAlgorithm {
    private static Object test;

    // Method for the Euclidean Algorithm
    public int gcd (int a, int b){
        
        // If statements to see if a < b then swaps
        if (a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        // If statement to see if b = 0
        if (b == 0){
        return a;
        
        }else{
            
            // Find new values for a and b
            int q = a/b;
            int r = a%b;
            
            // Calculate new gcd
            return gcd(b, r);
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object to run methods
        EuclideanAlgorithm test = new EuclideanAlgorithm();

        // Calling the gcd method and outputting the results
        int gcd = test.gcd(1378944, 120);
        System.out.println(gcd);

        
    }
    
}
