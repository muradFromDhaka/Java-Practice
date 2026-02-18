package BST_EXAMPLE;

public class Main {
    public static void main(String[] args) {
        // Create a new StudentBST instance
        StudentBST bst = new StudentBST();

        // Create some Student objects
        Student student1 = new Student(101, "John Doe", 20);
        Student student2 = new Student(102, "Jane Smith", 22);
        Student student3 = new Student(103, "Tom Brown", 21);
        Student student4 = new Student(104, "Emily White", 19);
        Student student5 = new Student(105, "Chris Green", 23);

        // Insert students into the BST
        bst.insert(student1);
        bst.insert(student2);
        bst.insert(student3);
        bst.insert(student4);
        bst.insert(student5);

        // Display students in in-order traversal
        System.out.println("In-order Traversal (Students sorted by ID):");
        bst.inorder();

        // Search for a student by ID
        System.out.println("\nSearching for student with ID 103:");
        Student foundStudent = bst.search(103);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Search for a student who doesn't exist
        System.out.println("\nSearching for student with ID 106:");
        foundStudent = bst.search(106);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student not found.");
        }
    }
}
