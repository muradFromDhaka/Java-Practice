public class JavaBasicsExamples {
    public static void main(String[] args) {

        // 1. Variable Declaration & Initialization
        int age = 25;
        // Integer age2 = 25;
        // byte a = 100;
        // Byte a1 = 100;
        // short b = 2000;
        // Short b1 = 2000;
        // long c = 123456789L;
        // Long c1 = 123456789L;
        // float pi = 3.14f;
        // Float pi1 = 3.14f;
        // double gpa = 8.56;
        // Double gpa1 = 8.56;
        // char grade = 'A';
        // Character grade1 = 'A';
        // boolean isPassed = true;
        // Boolean isPassed1 = true;

        
        String name = "Alice";
        System.out.println("Name: " + name + ", Age: " + age);

        // 2. String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);





        short b = 32767;
        // 2. Data Types
        byte smallNum = 100;
        short shortNum = 20000;
        int num = 100000;
        long bigNum = 123456789L;
        float pi = 3.14f;
        double gpa = 8.56;
        char grade = 'A';
        boolean isPassed = true;

        System.out.println("GPA: " + gpa + ", Grade: " + grade + ", Passed: " + isPassed);

        // 3. Arithmetic Operators
        int x = 10, y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // 4. Assignment Operators
        int a = 5;
        a += 3; // a = a + 3
        System.out.println("After += : " + a);

        // 5. Comparison Operators
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));

        // 6. Logical Operators
        boolean condition1 = x > 5;
        boolean condition2 = y < 5;
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));

        // 7. Unary Operators
        int count = 10;
        count++;
        System.out.println("Count after ++: " + count);
        count--;
        System.out.println("Count after --: " + count);

        // 8. Type Conversion (Casting)
        int intVal = 100;
        double doubleVal = intVal; // implicit
        System.out.println("Implicit cast (int to double): " + doubleVal);

        double d = 9.78;
        int i = (int) d; // explicit
        System.out.println("Explicit cast (double to int): " + i);

        // 9. Program: Area of a Circle
        double radius = 5.5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);

        // 10. Program: Voting Eligibility Check
        int voterAge = 20;
        if (voterAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // 11. Program: Palindrome Check
        String original = "madam";
        String reversed = "";
        for (int j = original.length() - 1; j >= 0; j--) {
            reversed += original.charAt(j);
        }
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
