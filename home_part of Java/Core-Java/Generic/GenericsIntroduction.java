package GenericEx;

import java.util.ArrayList;

public class GenericsIntroduction {
    public static void main(String[] args) {
        // Pre-generics code - prone to runtime errors
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add(123); // This will cause ClassCastException later
        
        String str = (String) list.get(2); // Runtime ClassCastException!
    }
}