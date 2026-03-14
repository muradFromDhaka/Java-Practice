public class Operators1 {

    public static void main(String[] args) {

        // Data type:
        // 1.variable declarition and initialization;
        System.out.println("\n1.variable declarition and ini");

        int age = 25;
        Integer age2 = 25;
        byte a = 100;
        Byte a1 = 100;
        short b = 2000;
        Short b1 = 2000;
        long c = 123456789L;
        Long c1 = 123456789L;
        float d = 3.14f;
        Float d1 = 3.12f;
        double gpa = 8.56;
        Double gpa1 = 8.56;
        char rade = 'A';
        Character rade1 = 'A';
        boolean isPassed = true;
        Boolean isPassed1 = true;

        int age3 = 25;
        String name = "Murad";
        System.out.println("Name:" + name + " " + "age:" + age3);

        // 2. String Concatenation;
        System.out.println("\n2.String Operators");
        String firstName = "MD";
        String lastName = "Murad";
        String fullName = firstName + " " + lastName;
        System.out.println("Full_name : " + fullName);

        // 3.Arithmetic Operators;
        System.out.println("\n3.Arithmetic Operators");
        int x = 10, y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // 4. Assignment Operators;
        System.out.println("\n4.Assignment Operators");

        int m = 5;

        m -= 1; // m = m -1

        m += 3; // m = m + 3

        m *= 2; // m = m * 2

        m /= 3; // m = m / 3

        m %= 2; // m = m % 2
        m = m + 1;
        m = m - 1;

        System.out.println("After += : " + m);
        int s = 5, r = 3;


        // 5.Relational (Comparison) Operators;
        System.out.println("\n5.Relational (Comparison) Operators:");
        System.out.println("s == r " + (s == r)); // equal to
        System.out.println("s != r " + (s != r)); // Not equal to
        System.out.println("s > r " + (s > r));
        System.out.println("s < b " + (s < r));
        System.out.println("s >= r " + (s >= r));
        System.out.println("s <= r " + (s <= r));


        // 6. Logical Operators;
        System.out.println("\n6.Logical Operators");
        boolean p = true, q = false;
        System.out.println("\nLogical Operators");
        System.out.println("p && q = " + (p && q)); //Logical AND;
        System.out.println("p || q = " + (p || q)); // Logical OR;
        System.out.println("!p: " + (!p)); // Logical Not;


        // 7. Unary Operators;
        System.out.println("\n7.Unary Operators");
        int e = 5;
        System.out.println("++e: " + (++e)); // Pre_increment
        System.out.println("e++: " + (e++)); // Post_increment
        System.out.println("e atrer Post_increment: " + e);

        System.out.println("--e: " + (--e)); // Pre_decrement
        System.out.println("e--: " + (e--)); // Post_decrement
        System.out.println("e atrer Post_decrement: " + e);
        System.out.println("!true: " + (!true)); // Logical Not;


        // 8. Bitwise Operators;
        System.out.println("\n8.Bitwise Operators");
        
        System.out.println("x & y: " + (x & y)); // AND
        System.out.println("x | y: " + (x | y)); // OR
        System.out.println("x ^ y: " + (x ^ y)); // XOR
        System.out.println("~x: " + (~x)); // Complement
        System.out.println("x << 1: " + (x << 1)); // Left Shift
        System.out.println("x >> 1: " + (x >> 1)); // Right Shift
        System.out.println("x >>> 1: " + (x >>> 1)); // Unsigned right Shift


        // 9. Ternary Operators;
        System.out.println("\n9.Ternary Operators");
        
        a = 5; b = 7;
        int result = (a <= b ) ? 100 : 200;
        System.out.println("Result = " + result);

        boolean o = true, t = false;
        String Result = (o && t || t && o) ? "karim" : "Rahim";
        System.out.println(Result);
        

        // 10. Instanceof Operators;        
        System.out.println("\n10. Instanceof Operators");

        Object val = "Hello";
               val = 5;
        System.out.println("str instanceof String: " + (val instanceof String));  //false
         System.out.println("str instanceof String: " + (val instanceof Integer));  //true


         

    }
}
