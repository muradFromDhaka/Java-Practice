/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import collectionFramework.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author B-2
 */
public class SortingExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA", 1));
        employees.add(new Employee("bbb", 2));
        employees.add(new Employee("CCC", 5));
        employees.add(new Employee("ddd", 7));
        employees.add(new Employee("EEE", 3));
        employees.add(new Employee("FFF", 10));
        Collections.sort(employees, (a,b) -> a.salary - b.salary);
        System.out.println("employees Sorted list by salary(Ascending Order): " + employees);
        Collections.sort(employees, (a,b) -> b.salary - a.salary);
        System.out.println("employees Sorted list by salary(Descending Order): " + employees);
        
        Collections.sort(employees, (a,b) -> a.name.compareTo(b.name));
        System.out.println("employees Sorted list by Name (Ascending Order): " + employees);
    
        
        
    }
      //insertionSort:
    public static void insertionSort(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                while(j >=0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
            }
        }
    
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
