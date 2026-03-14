/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryIOEx;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author B-2
 */
public class ObjectInputOutput implements Serializable {
    private int id;
    private String name;
    private String course;
    
    public ObjectInputOutput(int id,String  name,String course){
        this.id = id;
        this.name = name;
        this.course = course;
        
    }
    
    //============== 2. Object Serialization ==================
    public static final String OBJECCT_FILE = "C:\\Users\\B-2\\Desktop\\OldImage\\Students.abc";
    
    private static void writeObject(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(OBJECCT_FILE))){
            for (int i = 0; i < 10; i++) {
                oos.writeObject(new ObjectInputOutput(i+1, "Habib"+i, "Java" + i));
            }
            System.out.println("Objects written to " + OBJECCT_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void readObject(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(OBJECCT_FILE))) {
            while(true){  // keep reading until EOFException;
                ObjectInputOutput st = (ObjectInputOutput) ois.readObject();
                System.out.println("Object read: " + st.name);
            }
        } catch (EOFException e) {
            System.out.println("All objects read from file...");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        //writeObject();
        readObject();
    }
}
