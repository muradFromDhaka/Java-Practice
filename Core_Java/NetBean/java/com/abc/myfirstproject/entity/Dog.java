/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.entity;

/**
 *
 * @author B-2
 */
public class Dog {
   private String name;
   private String address;
    
   public Dog(String name){
       this.name = name;
    }
   
   public Dog(String name, String address){
       this.name = name;
       this.address = address;
    }
   
   public void getDate(){
       System.out.println("Number 1");
   }
   
   public String getDate(String name){
       System.out.println("Number 2" + name);
       
       return "Number 2";
   }
   
    public static void main(String[] args) {
        
    }
}
