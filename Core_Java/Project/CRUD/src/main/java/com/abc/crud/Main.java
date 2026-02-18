package com.abc.crud;

import com.abc.crud.entity.Student;
import com.abc.crud.service.StudentService;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentService studentDAO = new StudentService();

        Student student
                = new Student("ABC", "ABC@gmail.com", 50, LocalDate.of(2020, 05, 02));
        studentDAO.addStudent(student);

        List<Student> students = studentDAO.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        StudentService studentDAO = new StudentService();
//
//        while (true) {
//            System.out.println("Student Management System");
//            System.out.println("1. Add Student");
//            System.out.println("2. View All Students");
//            System.out.println("3. Update Student");
//            System.out.println("4. Delete Student");
//            System.out.println("5. Get Student by ID");
//            System.out.println("6. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();  // Consume newline
//
//            switch (choice) {
//                case 1:
//                    // Add Student
//                    System.out.print("Enter Name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter Email: ");
//                    String email = scanner.nextLine();
//                    System.out.print("Enter Age: ");
//                    int age = scanner.nextInt();
//                    scanner.nextLine();  // Consume newline
//
//                    System.out.print("Enter DOB (YYYY-MM-DD): ");
//                    String dobInput = scanner.nextLine();
//                    LocalDate dob = LocalDate.parse(dobInput);
//
//                    Student student = new Student(0, name, email, age, dob);
//                    studentDAO.addStudent(student);
//                    break;
//
//                case 2:
//                    // View All Students
//                    List<Student> students = studentDAO.getAllStudents();
//                    for (Student s : students) {
//                        System.out.println(s);
//                    }
//                    break;
//
//                case 3:
//                    // Update Student
//                    System.out.print("Enter Student ID to Update: ");
//                    int updateId = scanner.nextInt();
//                    scanner.nextLine();  // Consume newline
//                    System.out.print("Enter New Name: ");
//                    String updateName = scanner.nextLine();
//                    System.out.print("Enter New Email: ");
//                    String updateEmail = scanner.nextLine();
//                    System.out.print("Enter New Age: ");
//                    int updateAge = scanner.nextInt();
//                    scanner.nextLine();  // Consume newline
//
//                    System.out.print("Enter New DOB (YYYY-MM-DD): ");
//                    String updateDobInput = scanner.nextLine();
//                    LocalDate updateDob = LocalDate.parse(updateDobInput);
//
//                    Student updateStudent = new Student(updateId, updateName, updateEmail, updateAge, updateDob);
//                    studentDAO.updateStudent(updateStudent);
//                    break;
//
//                case 4:
//                    // Delete Student
//                    System.out.print("Enter Student ID to Delete: ");
//                    int deleteId = scanner.nextInt();
//                    studentDAO.deleteStudent(deleteId);
//                    break;
//
//                case 5:
//                    // Get Student by ID
//                    System.out.print("Enter Student ID to View: ");
//                    int searchId = scanner.nextInt();
//                    Student searchStudent = studentDAO.getById(searchId);
//
//                    if (searchStudent != null) {
//                        System.out.println("Student found: " + searchStudent);
//                    } else {
//                        System.out.println("No student found with ID: " + searchId);
//                    }
//                    break;
//
//                case 6:
//                    // Exit
//                    System.out.println("Goodbye!");
//                    return;
//
//                default:
//                    System.out.println("Invalid option. Try again.");
//            }
//        }
//    }
}
