public class SelectionEx2 {
    public static void main(String[] args) {
        
        // 1.Example for 'if' Statement
        int x = 10, y = 3, z = 4;
        System.out.println("\n1.Example for 'if' Statement");

        if(x > 5 && y > 5 || z < 5 && y < 5){
            System.out.println("x is greater than 5");
        }


         // 2.Example for 'if_else' Statement
         y = 30; 
        System.out.println("\n2.Example for 'if_else' Statement");

        if( y > 5){
            System.out.println("y is greater than 5");
        }else {
            System.out.println("y is not greater than 5");
        }


        // 3.Example for 'else_if' Statement
         y = 30; 
        System.out.println("\n3.Example for 'else_if' Statement");

        if( y > 10){
            System.out.println("y is greater than 10");
        }else if(y > 5) {
            System.out.println("y is greater than 5 but less than or equal to 10.");
        }else{
            System.out.println("y is less than or equal to 5");
        }

        //4.Example for 'Switch' Statement;
          int day = 3;
          String dayName;
          System.out.println("\n4.Example for 'Switch' Statement");

          switch(day){
            case 1:
               dayName = "Monday";
               break;
               case 2:
               dayName = "Tuesday";
               break;
               case 3:
               dayName = "Wednesday";
               break;
               case 4:
               dayName = "Thursday";
               break;
               case 5:
               dayName = "Friday";
               break;
               case 6:
               dayName = "Saturday";
               break;
               case 7:
               dayName = "Sanday";
               break;
            default :
               dayName = "Invalid day";

          }
          System.out.println("Day " + day + " is " + dayName);


          day = 4;
          System.out.println("\nExample of 'switch' expression");

          dayName = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
          };
          System.out.println("Day " + day + " is " + dayName);



        // 5.Example for Nested 'if' Statements
        int a = 10, b = 20;
        System.out.println("\n5.Example for Nested 'if' Statements");

        if( a > 10){
            if(b > 15){
                System.out.println("Both a and b are greater than their thresholds");
            }else{
                System.out.println("a is greater than 10, but b is not greater than 15.");
            }
        } else{
            System.out.println("a is not greater than 10");
        }



    }
}
