
import java.util.Arrays;
import java.util.Collections;

public class Exam1 {
    public static void main(String[] args) {
        // 1. Find the Sum of All Elements;
        
        int[] inpu = { 1,2,3,4,5};
        int sum = 0;
        sum = Arrays.stream(inpu).sum();
        System.out.println("Sum = " + sum);


        //2.Find the Largest Element;
        for(int i =0; i < inpu.length/2; i++){
            int temp = inpu[i];
            inpu[i] = inpu[inpu.length - i -1];
            inpu[inpu.length -i - 1] = temp;
        }
        int[] top1 = Arrays.copyOf(inpu, 1);
        System.out.println("Top1 element: " + Arrays.toString(top1));


        //3.Find the Smallest Element;
        Arrays.sort(inpu);
        int[] smal = Arrays.copyOf(inpu, 1);
        System.out.println("Smallest element: " + Arrays.toString(smal));


        //4.Count Even and Odd Numbers;


        //5.Reverse an Array;

        Integer[] arr = {1,2,3,4,5};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array: " +Arrays.toString(arr));
        
    }
}
