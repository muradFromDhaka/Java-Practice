package GenericEx;

import java.util.ArrayList;
import java.util.List;

public class RawTypesExample {
    
    public static void main(String[] args) {
        // Raw type (for backward compatibility)
        ArrayList rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123); // No compile-time check
        rawList.add(new Object());
        
        // This compiles but may cause ClassCastException at runtime
        String str = (String) rawList.get(1); // Runtime error!
        
        // Parameterized type (type-safe)
        ArrayList<String> safeList = new ArrayList<>();
        safeList.add("Hello");
        // safeList.add(123); // Compile-time error
        
        String safeStr = safeList.get(0); // No casting needed
        
        // Mixing raw and parameterized types (not recommended)
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList rawList2 = stringList; // Warning: unchecked conversion
        rawList2.add(123); // This will cause problems later
        
        // This will throw ClassCastException
        // String problem = stringList.get(0);
    }
    
    // Method using raw type (legacy code)
    public static void processRawList(List list) {
        for (Object obj : list) {
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println(str.toUpperCase());
            }
        }
    }
    
    // Equivalent method using generics
    public static void processGenericList(List<String> list) {
        for (String str : list) {
            System.out.println(str.toUpperCase());
        }
    }
    
    // Using wildcards for flexibility
    public static void processAnyList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}