public class LoopExample {
    public static void main(String[] args) {
  // ------------------------ For Loop ------------------------
        System.out.println("For Loop Example: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  // Prints numbers from 1 to 5
        }

        // ------------------------ While Loop ------------------------
        System.out.println("\nWhile Loop Example: ");
        int j = 10;
        while (j <= 5) {
            System.out.println(j++);
        }

        // ------------------------ Do-While Loop ------------------------
        System.out.println("\nDo-While Loop Example: ");
        int k = 1;
        do {
            System.out.println(k);  // Prints numbers from 1 to 5
            k++;
        } while (k <= 5);

        // ------------------------ Enhanced For Loop ------------------------
        System.out.println("\nEnhanced For Loop (for-each) Example: ");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int v : numbers) {
            System.out.println(v);  // Prints elements of the array
        }

        // ------------------------ Break Statement Example ------------------------
        System.out.println("\nUsing 'break' in a Loop: ");
        for (int i = 1; i <= 10; i+=3) {
            if (i == 5) {
                break;  // Exits the loop when i equals 5
            }
            System.out.println(i);  // Prints numbers 1 to 4, then exits the loop
        }

        // ------------------------ Continue Statement Example ------------------------
        System.out.println("\nUsing 'continue' in a Loop: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skips printing 5
            }
            System.out.println(i);  // Prints numbers from 1 to 10, except 5
        }
    }
}
