/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandlingEx;

/**
 *
 * @author B-2
 */
public class ExceptionExample {
    
     public static void main(String[] args) {
        System.out.println("Hello");
        nullPointerExample();  
        ArithmeticExample();
        ArrayIndexOutOfBounds();
        System.out.println("Bangladesh");
        
    }
    
    //1. nullPointException;
    public static void nullPointerExample(){
        try {
            String s = null; // Causes nullPointException;
        System.out.println(s.length());
        System.out.println("Bangladesh inside.");
        
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NullPointerException - " +e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception - " +e.getMessage());
        }
    }
    
    // 2. ArithmeticException;
    public static void ArithmeticExample(){
        try {
            int result = 10/0; // causes ArithmeticException;
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Cought ArithmeticException: " + e.getMessage());           
        }
    }
    
    // 3. ArrayIndexOutOfBoundsException;
    public static void ArrayIndexOutOfBounds(){
        try {
            int[] a = {1,2,3,4};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBound - " + e.getMessage() );
        }
    }
    
}
