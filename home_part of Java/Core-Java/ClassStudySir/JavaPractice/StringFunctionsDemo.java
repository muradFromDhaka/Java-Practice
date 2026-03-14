public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = "  Hello, Java Programming!  ";
        String anotherStr = "hello, java programming!";
        String emptyStr = "";
        
        // 1. Basic Functions
        System.out.println("=== Basic Functions ===");
        System.out.println("Original String: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));
        System.out.println("Equals: " + str.equals(anotherStr));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(anotherStr.trim()));
        System.out.println("CompareTo: " + str.compareTo(anotherStr));
        System.out.println("Is Empty: " + emptyStr.isEmpty());

        // 2. Searching & Matching
        System.out.println("\n=== Searching & Matching ===");
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello"));
        System.out.println("Ends with '!  ': " + str.endsWith("!  "));
        System.out.println("Matches regex '.*Java.*': " + str.matches(".*Java.*"));

        // 3. Modification Functions
        System.out.println("\n=== Modification Functions ===");
        System.out.println("To Lower Case: " + str.toLowerCase());
        System.out.println("To Upper Case: " + str.toUpperCase());
        System.out.println("Trim: '" + str.trim() + "'");
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("ReplaceAll 'a' with '@': " + str.replaceAll("a", "@"));
        System.out.println("ReplaceFirst 'a' with '#': " + str.replaceFirst("a", "#"));

        // 4. Conversion Functions
        System.out.println("\n=== Conversion Functions ===");
        char[] chars = str.toCharArray();
        System.out.print("To Char Array: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        String[] words = str.trim().split(" ");
        System.out.println("Split by space:");
        for (String word : words) {
            System.out.println(word);
        }

        int number = 123;
        boolean bool = true;
        System.out.println("Value Of (int): " + String.valueOf(number));
        System.out.println("Value Of (boolean): " + String.valueOf(bool));

        String name = "Alice";
        int age = 30;
        System.out.println("Formatted String: " + String.format("Name: %s, Age: %d", name, age));
    }
}
