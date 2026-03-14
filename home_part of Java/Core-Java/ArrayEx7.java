import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayEx7 {
    public static void main(String[] args) {
        
         //1.converting Array to asList; (asList 'Array' dynamic.)
        List<Integer> inList = new ArrayList<>();
        inList.add(50);
        inList.add(100);
        inList.add(120);
        System.out.println("Array asList: " + inList);

        Integer[] inArray = new Integer[3];
        inArray[0]=50;
        inArray[1]=100;
        inArray[2]=120;
        System.out.println("Array: " + Arrays.toString(inArray));

        //2.Normal Array to convert asList;
        List<Integer> intList = new ArrayList<>();
        intList = Arrays.asList(inArray);
        System.out.println("ArrayList: " + intList);

         //3. Array value sum;
        inArray = new Integer[7];
        inArray[0]=50;
        inArray[1]=100;
        inArray[3]=120;
        inArray[4]=120;
        inArray[5]=120;

         int sum = 0;
         for(Integer value : inArray){
            if(value != null){
                sum += value;
            }           
         }
         System.out.println("Sum: " +sum);
        

        int total =0;
        for(int i =0; i < inArray.length; i++){
            if( inArray[i] != null){
               total += inArray[i];
            }            
        }
        System.out.println("Total of inArray: " + total);

       //4.Array's value Sum when data "Non_primitive"
       sum = Arrays.stream(inArray).filter(Objects:: nonNull).mapToInt(Integer:: intValue).sum();


       //4.Array's value Sum when data 'primitive';
       int[] arr = {1,5,4,56,3,6,43};
       sum = Arrays.stream(arr).sum();
       
       System.out.println("Sum----" + sum);




       
    }
}
