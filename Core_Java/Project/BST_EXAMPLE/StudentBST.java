package BST_EXAMPLE;

public class StudentBST {
    Node root;

    // Constructor
    public StudentBST() {
        root = null;
    }

    // Insert a student into the BST
    public void insert(Student student) {
        root = insertRec(root, student);
    }

    // Recursive function to insert a student
    private Node insertRec(Node root, Student student) {
        if (root == null) {
            root = new Node(student);
            return root;
        }

        // Otherwise, recur down the tree
        if (student.getId() < root.student.getId()) {
            root.left = insertRec(root.left, student);
        } else if (student.getId() > root.student.getId()) {
            root.right = insertRec(root.right, student);
        }

        return root;
    }

    // Search for a student by ID
    public Student search(int id) {
        return searchRec(root, id);
    }

    // Recursive function to search a student by ID
    private Student searchRec(Node root, int id) {
        // Base case: root is null or student is found
        if (root == null || root.student.getId() == id) {
            return (root == null) ? null : root.student;
        }

        // ID is smaller, search left subtree
        if (id < root.student.getId()) {
            return searchRec(root.left, id);
        }

        // ID is greater, search right subtree
        return searchRec(root.right, id);
    }

    // In-order traversal of the BST (left-root-right)
    public void inorder() {
        inorderRec(root);
    }

    // Recursive function for in-order traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.student);
            inorderRec(root.right);
        }
    }
}

