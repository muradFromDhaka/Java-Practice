public class SelectionEx {

    public static void main(String[] args) {

        // Example for `if` Statement
        int x = 10;
        System.out.println("Example of 'if' statement:");
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // Example for `if-else` Statement
        int y = 30;
        System.out.println("\nExample of 'if-else' statement:");
        if (y > 5) {
            System.out.println("y is greater than 5");
        } else {
            System.out.println("y is not greater than 5");
        }

        // Example for `else-if` Ladder
        int z = 80;
        System.out.println("\nExample of 'else-if' ladder:");
        if (z > 15) {
            System.out.println("z is greater than 10");
        } else if (z > 5) {
            System.out.println("z is greater than 5 but less than or equal to 10");
        } else {
            System.out.println("z is less than or equal to 5");
        }

        // Example for `switch` Statement
        int day = 12;
        String dayName;
        System.out.println("\nExample of 'switch' statement:");
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName);

        day = 4;
        System.out.println("\nExample of 'switch' expression:");
        dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("Day " + day + " is " + dayName);




        // Example for Nested `if` Statements
        int a = 11, b = 15;
        System.out.println("\nExample of Nested 'if' statements:");
        if (a > 10) {
            if (b > 15) {
                System.out.println("Both a and b are greater than their thresholds");
            } else {
                System.out.println("a is greater than 10, but b is not greater than 15");
            }
        } else {
            System.out.println("a is not greater than 10");
        }






        // Example for `switch` with Strings (Java 7+)
        String color = "green";
        System.out.println("\nExample of 'switch' with Strings:");
        switch (color) {
            case "red":
                System.out.println("Color is red");
                break;
            case "green":
                System.out.println("Color is green");
                break;
            case "blue":
                System.out.println("Color is blue");
                break;
            default:
                System.out.println("Unknown color");
        }
    }
}
