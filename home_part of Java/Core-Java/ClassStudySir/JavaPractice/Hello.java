public class Hello {

    public static void main(String[] args) {

        int age = 25;

        // int a = 10;

        // // 3. Arithmetic Operators
        // int x = 10, y = 3;
        // System.out.println("x + y = " + (x + y));
        // System.out.println("x - y = " + (x - y));
        // System.out.println("x * y = " + (x * y));
        // System.out.println("x / y = " + (x / y));
        // System.out.println("x % y = " + (x % y));

        // 4. Assignment Operators
        // int a = 5;
        // a -= 1;
        // a += 3; // a = a + 3
        // a *= 2; // a = a * 2
        // a /= 3; // a = a / 3
        // a %= 2; // a = a % 2
        // a = a + 1;
        // a = a - 1;
        // System.out.println("After += : " + a);

        // 1. Arithmetic Operators
        int a = 5, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        int x = 5, y = 7;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x == y && x < y)); // Logical AND
        System.out.println("x || y: " + (x >= y || y > x)); // Logical OR
        System.out.println("!x: " + (!(x < y))); // Logical NOT

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; // Add and assign
        System.out.println("c += 5: " + c); // c = 15
        c -= 3; // Subtract and assign
        System.out.println("c -= 3: " + c); // c = 12
        c *= 2; // Multiply and assign
        System.out.println("c *= 2: " + c); // c = 24
        c /= 4; // Divide and assign
        System.out.println("c /= 4: " + c); // c = 6
        c %= 2; // Modulo and assign
        System.out.println("c %= 2: " + c); // c = 0

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("d after post-increment: " + d); 
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("d after post-decrement: " + d); 
        System.out.println("!true: " + (!true)); // Logical NOT

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int e = 5, f = 3; // 0101 and 0011 in binary
        System.out.println("e & f: " + (e & f)); // AND
        System.out.println("e | f: " + (e | f)); // OR
        System.out.println("e ^ f: " + (e ^ f)); // XOR
        System.out.println("~e: " + (~e)); // Complement
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift
        System.out.println("e >>> 1: " + (e >>> 1)); // Unsigned right shift

        // 7. Ternary Operator
        a = 5;
        b = 3;
        System.out.println("\nTernary Operator:");
        int result = (a <= b) ? 100 : 200 ;
        System.out.println("Ternary result (a > b ? 100 : 200): " + result);

        // 8. Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        Object val = 5;
               val = "Hello";
        System.out.println("str instanceof String: " + (val instanceof String)); // true
        System.out.println("str instanceof String: " + (val instanceof Integer)); // true

    }

}