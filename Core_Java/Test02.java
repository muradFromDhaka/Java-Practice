package Method8;

import java.util.Arrays;

public class Test02 {
   public static void main(String[] args) {
          Test02 t = new Test02();
          t.greating();
          t.greating("Khalid");
   } 

   public void greating(){
    System.out.println("Hello, I am from TCLK.");
   }

    public void greating(String name){
    System.out.println("Hello, My name is " + name + "!!");
   }


   static int[] removeDuplicates(int[] arr){
     return Arrays.stream(arr).distinct().toArray();
   }
}
