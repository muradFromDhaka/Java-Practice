import java.util.Arrays;

public class Murad_Practice {
    public static void main(String[] args) {
        // 1. Arithmatic Operators;

        int x = 13, y = 10;
        System.out.println("x+y: " + (x + y));
        System.out.println("x-y: " + (x - y));
        System.out.println("x*y: " + (x * y));
        System.out.println("x/y: " + (x / y));
        System.out.println("x%y: " + (x % y));

        // 2. Assignment Operators;
        x = 15;
        x -= 1;
        x += 1;
        x *= 2;
        x /= 3;
        x = x + 2;
        x = x - 2;
        x %= 2;
        System.out.println("Result: " + x);

        // 3. Relational or comparison Operators;
        int a = 20, b = 5;
        System.out.println("a != b: " + (a != b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("!(a > b) " + !(a > b));
        // 4. Logical Operators;
        boolean p = true, q = false;
        System.out.println(" p && q:" + (p && q));
        System.out.println(" p || q:" + (p || q));
        System.out.println(" !q:" + !q);
        System.out.println();

        // 5. Unary Operators;
        b = 5;
        System.out.println("++b:" + ++b);
        System.out.println("b++:" + b++);
        System.out.println("--b:" + --b);
        System.out.println("b--:" + b--);
        System.out.println(b);

        // 6. Ternary Operators;
         int m = 6 , n = 2;
         String result = m > n ? "Murad": "Nasir";
         System.out.println("Result: " + result);
         int result1 = m < n ? 1 : 0;
         System.out.println("result1: " + result1);
         String result2 = m >= n ? "Murad": "Nasir";
         System.out.println("Result: " + result2);
         int result3 = m <= n ? 1 : 0;
         System.out.println("result1: " + result3);
         String result4 = !(m > n) ? "Murad": "Nasir";
         System.out.println("Result: " + result4);
         
         int  i = 0;
         for(; i < 4; i+=2){
            System.out.println("value: "+ i);
         }
         System.out.println(i);

         int age = 25;
         String firstname = "Ziaul Islam";
         System.out.println("Name: " +firstname  + ",  Age: " + age);
         String lastname = " Murad";
         String name = firstname + lastname;
         System.out.println(name);

         // type conversion;
         int d = 12;
         double e = d;
         System.out.println("double " + e);

         // area of cicle ;
          double redius = 12;
          double area = 3.14 * redius * redius;
          System.out.println("Area: " + area);

          // Palindrome Check;
          String original = "madam";
          String reversed = "";
          for(i = original.length() - 1; i >= 0; i--){
            reversed += original.charAt(i);
          }
          if(original.equals(reversed)){
            System.out.println(reversed + " is a palindrome.");
          }else{
            System.out.println(reversed + " is not a palindrome.");
          }


          String name1 = "level";
          String reverse = "";
          for(i = name1.length() - 1; i >= 0; i--){
            reverse += name1.charAt(i);
          }
          if(name1.equals(reverse)){
            System.out.println(reverse + " is a palindrome");
          }else{
            System.out.println(reverse + " is not a palindrome.");
          }
    }
}
