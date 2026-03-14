// File: AdvancedObjectConcepts.java

// ----------------------------------
// 1. FIELD ENCAPSULATION
// ----------------------------------

// Class with private fields (Encapsulation)
class Person {
    // Fields are private
    private String name;
    private int age;

    // Public getters and setters (Accessors/Mutators)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // You can add validation here
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// ----------------------------------
// 2. PASSING OBJECTS TO METHODS
// ----------------------------------

class Calculator {
    public void doubleAge(Person person) {
        // Modify the object passed as a parameter
        person.setAge(person.getAge() * 2);
    }
}

// ----------------------------------
// 3. ARRAY OF OBJECTS
// ----------------------------------

// Class representing a student
class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void showDetails() {
        System.out.println("Student Name: " + name + ", Roll No: " + roll);
    }
}

// ----------------------------------
// 4. IMMUTABLE OBJECTS AND CLASSES
// ----------------------------------

// Final class with final fields (Immutable)
final class Book {
    private final String title;
    private final String author;

    // Constructor initializes final fields
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // No setters, only getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display method
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

// ----------------------------------
// MAIN CLASS TO TEST ALL EXAMPLES
// ----------------------------------

public class AdvancedObjectConcepts {

    public static void main(String[] args) {

        // 1. FIELD ENCAPSULATION
        System.out.println("== Field Encapsulation ==");
        Person p1 = new Person();
        p1.setName("Alice");
        p1.setAge(25);
        p1.displayInfo();

        // 2. PASSING OBJECTS TO METHODS
        System.out.println("\n== Passing Objects to Methods ==");
        Calculator calc = new Calculator();
        calc.doubleAge(p1);  // p1's age is now doubled
        p1.displayInfo();

        // 3. ARRAY OF OBJECTS
        System.out.println("\n== Array of Objects ==");
        Student[] students = new Student[3];
        students[0] = new Student("John", 101);
        students[1] = new Student("Emma", 102);
        students[2] = new Student("Raj", 103);

        for(Student s : students) {
            s.showDetails();
        }

        // 4. IMMUTABLE OBJECTS AND CLASSES
        System.out.println("\n== Immutable Objects and Classes ==");
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");

        b1.display();
        b2.display();

        // Uncommenting below lines would cause errors (immutability)
        // b1.title = "New Title"; // Error: cannot assign value to final variable
        // b1.setTitle("New Title"); // No such method exists
    }
}
