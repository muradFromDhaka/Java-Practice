package GenericEx;

import java.util.ArrayList;

public class GenericsBenefits {
    public static void main(String[] args) {

        // String[] valus = new String[2];
        // valus[0] = "Hello";
        // valus[1] = 10 + "";

        // String str = valus[0]; // No casting needed
        // System.out.println("First element: " + str);

        // With generics - compile-time type safety

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(7);
        // list.add(123); // Compile-time error!

        ArrayList<String> stList = new ArrayList<>();

        stList.add("Hello");
        stList.add("World");

        ArrayList<Student> studList = new ArrayList<>();
        studList.add(new Student(1, "Vivek01", "Java"));
        studList.add(new Student(2, "Vivek02", "Java"));
        studList.add(new Student(3, "Vivek03", "Java"));  

        
        // list.add(123); // Compile-time error!

        // ArrayList allList = new ArrayList<>();

        // allList.add("Hello");
        // allList.add("World");
        // allList.add(5);
        // allList.add(true);

        // list.add(123); // Compile-time error!

        String str = stList.get(0); // No casting needed
        System.out.println("First element: " + str);
    }
}

class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

}