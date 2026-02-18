/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheretanceEx;


/**
 *
 * @author B-2
 */
public class TestMain {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.sound();
        d1.canEat();
        System.out.println(d1.name);
        System.out.println(""); 
        
        Animal ani = new Animal();
        ani.sound();
        ani.canEat();
        System.out.println(ani.name);
        System.out.println("");
        
        Animal anim = new Tiger();
        ani.sound();
        ani.canEat();
        System.out.println(ani.name);
        System.out.println("");
        
        Tiger t1 = new Tiger();
        System.out.println(t1.name);
        t1.sound();
        t1.canEat();
        
        
        
    }
}
