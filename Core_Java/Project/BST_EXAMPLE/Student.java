package BST_EXAMPLE;

public class Student {
    int id;
    String name;
    int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}
