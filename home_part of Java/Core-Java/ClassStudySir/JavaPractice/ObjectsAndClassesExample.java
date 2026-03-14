// File: ObjectsAndClassesExample.java

// 1. Class definition (blueprint)
class Car {
    // Fields or properties
    String color; // Color of the car
    int year;     // Manufacturing year

    // Method to simulate driving
    void drive() {
        System.out.println("The car is driving...");
    }

    // Method to display the details of the car
    void displayInfo() {
        System.out.println("Car Color: " + color);
        System.out.println("Manufacturing Year: " + year);
    }
}

// 2. Another class to create and use objects
public class ObjectsAndClassesExample {

    public static void main(String[] args) {
        // Creating first object of Car
        Car car1 = new Car(); // Instantiating a new Car object
        car1.color = "Red";   // Setting property
        car1.year = 2020;     // Setting property

        // Calling methods on car1
        car1.drive();
        car1.displayInfo();

        System.out.println("---------------");

        // Creating second object of Car
        Car car2 = new Car(); // Another object
        car2.color = "Blue";
        car2.year = 2023;

        // Calling methods on car2
        car2.drive();
        car2.displayInfo();
    }
}
