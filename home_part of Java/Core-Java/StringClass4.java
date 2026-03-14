public class StringClass4 {
    public static void main(String[] args) {

        // 1.StringBuilder Example;

        System.out.println("n\1.1.StringBuilder Example;");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        sb.replace(6,10, "C++");
        System.out.println("After replace: " + sb);
        sb.delete(6,10);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // reverse again to original
        System.out.println("To String: " + sb.toString());
        String name = sb.toString();

        


         System.out.println("n\1.2.StringBuffer Example;");
         StringBuffer sbuf = new StringBuffer("Welcome ");
        sbuf.append(" User");
        System.out.println("After append: " + sbuf);
        sbuf.insert(6, "Java ");
        System.out.println("After insert: " + sbuf);
        sbuf.replace(8,13, "Python");
        System.out.println("After replace: " + sbuf);
        sbuf.delete(8,14);
        System.out.println("After delete: " + sbuf);
        sbuf.reverse();
        System.out.println("After reverse: " + sbuf);
        System.out.println("To String: " + sbuf.toString());
        
    }
}
