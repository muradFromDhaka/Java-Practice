/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericEx;

/**
 *
 * @author B-2
 */
 
  public class GenericDemo{
         public static void main(String[] args) {
          BOX<String,Integer> StringBox = new BOX<>();
          StringBox.setxValue("Hello Generics");
          StringBox.setyValue(100);
          
             System.out.println(StringBox.getxValue());
             System.out.println(StringBox.getyValue());
             
             
             BOX<Integer,Boolean> IntBox = new BOX<>();
          IntBox.setxValue(100);
          IntBox.setyValue(true);
          
          System.out.println(IntBox.getxValue());
             System.out.println(IntBox.getyValue());
          
          
      }
     }

