package GenericEx;
class Util {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Java", "Generics", "Rocks"};

        Util.printArray(intArray);
        Util.printArray(strArray);
    }
}
