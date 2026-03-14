/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryIOEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author B-2
 */
public class BinaryIODemo {
    private static void copyImage(){
        String source = "C:\\Users\\B-2\\Desktop\\OldImage\\img2.jpg";
        String dest = "C:\\Users\\B-2\\Desktop\\CopyImage\\abc2.jpg";

        try (   // try with resource;
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
                ){
            byte[] buffer = new byte[4096];   // bigger buffer = faster copy
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File copied (with buffer) from " + source + " to " + dest);
    }
    
    public static void main(String[] args) {
        try {
            copyImage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
