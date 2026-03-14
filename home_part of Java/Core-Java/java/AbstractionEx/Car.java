/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractionEx;

/**
 *
 * @author B-2
 */
public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }
    @Override
    public void stopEngine(){
         System.out.println("Engine Stoped");
    }

    @Override
    public int setGiar(int val){
         System.out.println("Gair number " + val);
        return val;
    }
    
    public void getData(){
        
    }
}
