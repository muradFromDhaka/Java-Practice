package ClassStudySir.JavaPractice;

// File: MethodsInJavaExample.java

public class MethodsInJavaExample {

    // 1. Instance Method: Belongs to an object of the class
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // 2. Static Method: Belongs to the class itself and can be called without creating an object
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // 3. Constructor Method: Special method called when an object is created
    private String carColor;

    // Constructor to initialize carColor
    public MethodsInJavaExample(String color) {
        this.carColor = color;
    }

    // Displaying the color of the car
    public void displayCarColor() {
        System.out.println("The car color is: " + carColor);
    }

    // 4. Abstract Method Example (requires an abstract class)
    // This class is abstract and can't be instantiated directly
    abstract static class Animal {
        // Abstract method (no implementation here)
        public abstract void makeSound();
    }

    // Concrete class that implements the abstract method
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    }

    // 5. Method Overloading: Same method name with different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 6. Method Returning a Value: A method that returns a result
    public int multiply(int a, int b) {
        return a * b;
    }

    // 7. Method with Void Return Type: A method that does not return any value
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Main method to run examples
    public static void main(String[] args) {
        // 1. Calling Instance Method (need to create an object)
        MethodsInJavaExample obj1 = new MethodsInJavaExample("Red");
        obj1.instanceMethod(); // Calls the instance method
        
        // 2. Calling Static Method (no need to create an object)
        MethodsInJavaExample.staticMethod(); // Calls static method

        // 3. Using Constructor to create an object
        obj1.displayCarColor(); // Calls method that displays car color
        
        // 4. Using Abstract Class and Method
        Animal myDog = new Dog();  // Create an object of Dog (which extends Animal)
        myDog.makeSound(); // Calls makeSound method of Dog class

        // 5. Method Overloading Example
        MethodsInJavaExample obj2 = new MethodsInJavaExample("Blue");
        int sumInt = obj2.add(5, 7); // Calls int version
        double sumDouble = obj2.add(2.5, 3.4); // Calls double version
        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);

        // 6. Method Returning a Value
        int product = obj2.multiply(6, 9); // Calls multiply method
        System.out.println("Product: " + product);

        // 7. Void Method Example
        obj2.printMessage("This is a message from the printMessage method!");
    }
}
