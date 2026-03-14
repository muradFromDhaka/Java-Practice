import java.util.Arrays;
import java.util.Random;

public class BuiltInFunction3 {
    public static void main(String[] args) {
        // 1. Mathematical Function;
        // ==================================
        System.out.println("\n1. Mathematical Function");

        System.out.println("Absolute vallue of -5 is equal " + Math.abs(-5));
        System.out.println("Max of 10 and 20 " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));
        System.out.println("Square root of 25" + Math.sqrt(25));
        System.out.println("2 raised to power 3: " + Math.pow(2, 3));
        System.out.println("Round 4.6: " + Math.round(4.6));
        System.out.println("Floor 4.9: " + Math.floor(4.9));
        System.out.println("Ceil 4.1: " + Math.ceil(4.1));

        // Generating random numbers using Random class;

        for (int i = 0; i < 10; i++) {
            System.out.println("Random value " + (i + 1) + " : " + (Math.random() * 100));
        }

        System.out.println("\nGenerating random numbers using Random class");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(100)); // Random number between 0 and 99;
        }

        double degrees = 90;
        double radians = Math.toRadians(degrees);
        System.out.println("Sin(90): " + Math.sin(radians));
        System.out.println("cos(90): " + Math.cos(radians));
        System.out.println("tan(45): " + Math.tan(Math.toRadians(45)));

        // 2.Character Functions;
        System.out.println("\n 2.Character Functions;");
        char ch = 'a';
        System.out.println("Is 'a'  a latter? " + Character.isLetter(ch));
        System.out.println("Is '9'  a digit? " + Character.isDigit('9'));
        System.out.println("Is space a whitespace? " + Character.isWhitespace(' '));
        System.out.println("Is 'A'  a upperCase? " + Character.isUpperCase('A'));
        System.out.println("Is 'a' a lowerCase? " + Character.isLowerCase('a'));
        System.out.println("UpperCase of 'b': " + Character.toUpperCase('b'));
        System.out.println("LowerCase of 'B': " + Character.toLowerCase('B'));

        // 3.String Function;
        System.out.println("\n3.String Function;");

        String text = "  Hello Java World  ";
        System.out.println("Length: " + text.length());
        System.out.println("Original: '" + text + "'");
        System.out.println("Trimed: '" + text.trim() + "'");
        text = text.trim();
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 1 : " + text.charAt(1));
        System.out.println("Substring (6,11):" + text.substring(6, 11));
        System.out.println("Equals 'Hello Java World': " + text.trim().equals("Hello Java World"));
        System.out.println("EqualsIgnoreCase 'Hello Java World': " + text.trim().equalsIgnoreCase("Hello java world"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("indexOf 'o': " + text.indexOf('o'));
        System.out.println("lastIndexOf : " + text.lastIndexOf('o'));

        // Split example;
        String csv = "apple,banana,cherry,Orange,mango";

        String[] fruits = csv.split(",");
        System.out.println("Split CSV:");
        System.out.println(Arrays.toString(fruits));

        String bang = "BANGLADESH";
        String[] Bang = bang.split("");
        System.out.println(Arrays.toString(Bang));

        System.out.println("\nFor_each loop");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nFor_i loop / For Loop");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(Arrays.toString(fruits));
        }

        // maxSplit
        System.out.println("\n = split(delimiter,maxsplit)");
        String[] fruitss = csv.split(",", 3);
        System.out.println(Arrays.toString(fruitss));

        String num = "1,3,5,34,6,7,4,4";
        String[] numArr = num.split(",");
        System.out.println(Arrays.toString(numArr));
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(numArr));
        }
        
    }
}
