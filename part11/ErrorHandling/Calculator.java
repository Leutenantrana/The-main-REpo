package part11.ErrorHandling;
import java.lang.Math;

public class Calculator {

    public Calculator (){

    }

    public static int factorial(int number){
        if (number<0) {
            throw new IllegalArgumentException("Invalid Number");
            
        }
        int i =-1;
        int fact = 1;

        for(i= number; i>0;i--){
            fact = fact* number;

        }
        return fact;
    }
    public static long binomialCoefficient(int n, int k) {

        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid parameters for binomial coefficient calculation");
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    

    public static void main(String[] args) {
        Calculator calci = new Calculator();
        calci.factorial(-3);
    }


    
}
