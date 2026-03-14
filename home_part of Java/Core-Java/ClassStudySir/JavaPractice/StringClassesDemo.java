public class StringClassesDemo {
    public static void main(String[] args) {

        System.out.println("=== StringBuilder Example ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // reverse again to original
        System.out.println("To String: " + sb.toString());
        String name = sb.toString();

        System.out.println("\n=== StringBuffer Example ===");
        StringBuffer sbuf = new StringBuffer("Welcome");
        sbuf.append(" User");
        System.out.println("After append: " + sbuf);
        sbuf.insert(8, "Java ");
        System.out.println("After insert: " + sbuf);
        sbuf.replace(8, 13, "Python");
        System.out.println("After replace: " + sbuf);
        sbuf.delete(8, 14);
        System.out.println("After delete: " + sbuf);
        sbuf.reverse();
        System.out.println("After reverse: " + sbuf);
        System.out.println("To String: " + sbuf.toString());


        // String address = "123 Main St, Anytown, USA";
        // address = "456 Oak St, Anytown, USA";


       //Reasing a StringBuilder no 1
        sb = new StringBuilder("Hello, World!");

        // Reasing a StringBuilder no 2
        sb.setLength(0);
        System.out.println(sb); // Output: ""

        sb.append("ABC");
        System.out.println(sb); // Output: ABC
    }
}
