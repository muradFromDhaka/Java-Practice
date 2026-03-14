/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryIOEx;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author B-2
 */
public class NIOExample {

    public static void nio() {
        Path source = Paths.get("C:\\Users\\B-2\\Desktop\\OldImage\\img2.jpg");
        Path dest = Paths.get("C:\\Users\\B-2\\Desktop\\CopyImage\\pathCopy2.jpg");
        
        try {
            //copy file 
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully...");
        } catch (Exception e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        nio();
    }

}
