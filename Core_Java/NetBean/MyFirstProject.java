/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abc.myfirstproject;

import com.abc.myfirstproject.entity.Dog;
import com.abc.myfirstproject.entity.Student;
import java.util.Arrays;

/**
 *
 * @author B-2
 */
public class MyFirstProject {
    public static void main(String[] args) {
        
//       Student st1 = new Student(8, "Khalid", 30);
//       
//       Student[] stu = new Student[10];
//       
//       stu[0] = new Student(1, "Mohammad", 30);
//       stu[1] = new Student(2, "Jon", 30);
//       stu[2] = new Student(3, "Doe", 30);
//       stu[3] = new Student(4, "Jidan", 30);
//       stu[4] = new Student(5, "Jamal", 30);
//       stu[5] = new Student(6, "A. Jolil", 30);
//       stu[6] = new Student(7, "Abu Jafor", 30);
//       stu[7] = st1;
//
//
//        System.out.println(stu[3].getAge());
//        System.out.println(stu[6].getName());
//        System.out.println(Arrays.toString(stu));
//        System.out.println("");
//        
//       for(int i = 0; i < stu.length; i++){
//             System.out.println(stu[i]);
//       }
//        System.out.println("");
//        
//       for(Student x : stu){
//           System.out.println(x);
//       }


//       st1.printAll();  
//       st1.setName("Mohammad");
//       st1.printAll();
//       System.out.println("st1.getAll()");
//       System.out.println("st1.getName()");
//       System.out.println("st1.getAge()");
       


        Dog d = new Dog("Tommy", "Dhaka");
        printDog(d);
    }
             

     public static void printDog(Dog a){
             System.out.println("Dog name: " + a.name + "Dog Address: " + a.address);
             System.out.println("Dog Address: " + a.address);
        }
}
