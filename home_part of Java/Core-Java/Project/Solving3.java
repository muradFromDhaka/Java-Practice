/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaProblemSolveing;

/**
 *
 * @author B-2
 */
public class Solving3 {
    public static void main(String[] args) {
        
        fibonacci(10);
        System.out.println("First 15 Fibonacci numbers: ");
        for(int i = 0; i < 15; i++){
            System.out.println(fibonacciRecursive(i)+ " ");
        }
    }
    
    
    
    //1. Fibonacci Number:  0,1,1,2,3,5,8,13,21,34,
    
    public static void fibonacci(int n){
        int a =0, b=1, c;
        for(int i = 2; i < n; i++){
            c = a + b;  
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    
    //1.1 Fibonacci Number(Recursive way):
    public static long fibonacciRecursive(int n){
        if(n < 0){
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers.");
        }
        if(n == 0){  // Base case 1
            return 0;
        }
        if(n == 1){  // Base case 2
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); //Recaursive case
    }
    
    public static void sumOfNaturalNumbers(int n){
        
    }
}
