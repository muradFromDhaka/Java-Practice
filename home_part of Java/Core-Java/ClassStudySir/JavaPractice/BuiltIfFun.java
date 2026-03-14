import java.util.Arrays;
import java.util.Random;

public class BuiltIfFun {
    public static void main(String[] args) {

        // ============================
        // 1. MATHEMATICAL FUNCTIONS
        // ============================
        System.out.println("=== Mathematical Functions ===");
        System.out.println("Absolute value of -5: " + Math.abs(-5));
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2 raised to power 3: " + Math.pow(2, 3));
        System.out.println("Round 4.6: " + Math.round(4.5));
        System.out.println("Floor 4.9: " + Math.floor(4.9));
        System.out.println("Ceil 4.1: " + Math.ceil(4.1));




        // double randomValue = Math.random(); // between 0.0 and 1.0

        for (int i = 0; i < 10; i++) {
            System.out.println("Random value " + (i+1) + ": " + (int)( Math.random() * 100 + 1 ));
        }




        Random rand = new Random();

        // Generating random numbers using Random class
        for (int i = 0; i < 10; i++) {
            System.out.println("Random value " +(rand.nextInt())); // Random number between 0 and 99
        }






        double degrees = 90;
        double radians = Math.toRadians(degrees);
        System.out.println("Sin(90°): " + Math.sin(radians));
        System.out.println("Cos(90°): " + Math.cos(radians));
        System.out.println("Tan(45°): " + Math.tan(Math.toRadians(45)));

        System.out.println();

        // ============================
        // 2. CHARACTER FUNCTIONS
        // ============================
        System.out.println("=== Character Functions ===");
        char ch = 'a';
        System.out.println("Is 'a' a letter? " + Character.isLetter(ch));
        System.out.println("Is '9' a digit? " + Character.isDigit('9'));
        System.out.println("Is space a whitespace? " + Character.isWhitespace(' '));
        System.out.println("Is 'A' uppercase? " + Character.isUpperCase('A'));
        System.out.println("Is 'a' lowercase? " + Character.isLowerCase('a'));
        System.out.println("Uppercase of 'b': " + Character.toUpperCase('b'));
        System.out.println("Lowercase of 'B': " + Character.toLowerCase('B'));

        System.out.println();

        // ============================
        // 3. STRING FUNCTIONS
        // ============================
        System.out.println("=== String Functions ===");

        String text = "  Hello Java World Java  ";

        System.out.println("Original: '" + text + "'");
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 1: " + text.charAt(1));
        System.out.println("Substring (2, 7): '" + text.substring(2, 7) + "'");
        System.out.println("Equals 'Hello Java World': " + text.trim().equals("Hello Java World"));
        System.out.println("EqualsIgnoreCase 'hello java world': " + text.trim().equalsIgnoreCase("hello java world"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("Index of 'o': " + text.indexOf('o'));
        System.out.println("Last index of 'o': " + text.lastIndexOf('o'));




        // Split example
        String csv = "apple,banana,cherry";


        String[] fruits = csv.split(",");
        System.out.println("Split CSV:");

        String abc = fruits[2];

        System.out.println(Arrays.toString(fruits));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }





        System.out.println();

        // ============================
        // EXTRA: StringBuilder Example
        // ============================
        System.out.println("=== StringBuilder Example ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.deleteCharAt(2);
        System.out.println("StringBuilder final: " + sb);
    }
}
