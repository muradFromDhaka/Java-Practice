public class LoopEx4 {
    
    public static void main(String[] args) {
              // Loop Example;
      //====================================

              //--------1.For Loop-------
        System.out.println("1.For Loop Example: ");
        
        for(int i = 1; i <= 5; i++){
            System.out.println(i); // Prints numbers from 1 to 5;

        }
              //-------2.While Loop----------------
        System.out.println("2.While Loop Example: ");

        int j = 1;
        while(j <= 5){
            System.out.println(++j);
        }

        //--------------3.Do while loop-------------
        System.out.println("3.Do_While Loop Example: ");

        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while(k <= 5);


        
         //--------------4.Enhanced for loop(for_each)-------------
        System.out.println("4.Enhanced for Loop(for_each) Example: ");

        int[] numbers = {1,2,3,4,5};
        for(int v : numbers){
            System.out.println(v);  // Print elements of the array;
        }



         //--------------5.Break Statement Example-------------
        System.out.println("5.Break in a for loop: ");
    
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println();
            }else{

                 System.out.println(i);
            }
  
        }

         //--------------6.Continue Statement Example-------------
        System.out.println("6.Continue' in a for loop: ");

         for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            }

            System.out.println(i);
        }

    }
}
