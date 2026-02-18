/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author B-4
 */
public class StringPrograms {
    
    public static void main(String[] args) {
        String str = "Bangladesh";
//		System.out.println(reverse(str));

         char[] strArr = str.toCharArray();
         
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        
        
        int[] ar = {100, 700, 505, 903, 402, 6, 77, 80};
        
        

    }
    
    
    
    
    
    public static String reverse(String in) {
        if (in == null) {
            throw new IllegalArgumentException("Null is not valid input");
        }
        
        StringBuilder out = new StringBuilder();
        
        char[] chars = in.toCharArray();
        
        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }
        
        return out.toString();
    }
    
}
