// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    // Factorial can throw an IllegalArgumentException
    //-------------------------------------------------------------
    public static int factorial(int n){
        int fac = 1;
        if(n < 0){
            throw new IllegalArgumentException(n + " adalah angka negatif!"); 
        }
        else{
            for (int i=n; i>0; i--)
                fac *= i;                          
            return fac;            
        }
    }
}
