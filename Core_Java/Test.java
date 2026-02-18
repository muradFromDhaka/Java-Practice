package Method8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Employees emp1 = new Employees();

        // emp1.id = 501L;
        // emp1.name = "Khalid";
        // emp1.salary = 1000000;
        // emp1.designation = "HR";

        // Employees emp2 = new Employees(60L, "Mamun", "MAN", 50000);

        // double emp1Salary = emp1.getSalary();
        // double emp2Salary = emp1.getSalary();

        // System.out.println("emp1Salary: " + emp1Salary + " ; " + "emp2Salary: " + emp2Salary);

        // double emp1Tax = Employees.calculateTax(emp1Salary, 10);
        // double emp2Tax = Employees.calculateTax(emp1Salary, 20);

        // System.out.println("emp1Salary: " + emp1.getSalary()+ "emp2Salary: " +
        // emp2.getSalary());
        // System.out.println(emp1.id);
        // System.out.println(emp1.name);

         int[] arr = { 5, 7, 2, 3, 9, 4, 5, 6};
         int SM = getSecondMax(arr);
         System.out.println("The Second largest number: " + SM);


         int[] arr1 = { 5, 7, 2, 3, 9, 4, 5, 6};

        //  isSorted(arr);
          int[] sss = isSorted(arr1);
          
         System.out.println("isSorted = " + isSorted(arr));

        }

   



    public static int getSecondMax(int[] array){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                secondMax = max;
                max = array[i];
            }else if(array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }
        }
        if(secondMax != Integer.MIN_VALUE){
            return secondMax;
        }
        return 0;
    }



    public static boolean isSorted(int[] array1){

        int[] arrCopy = Arrays.copyOf(array1, array1.length);
        Arrays.sort(arrCopy);

       return Arrays.equals(arrCopy, array1);       
    }

}
