/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryIOEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author B-2
 */
public class BinaryIOExample {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\B-2\\Desktop\\OldImage\\img3.docx");
       out = new FileOutputStream("C:\\Users\\B-2\\Desktop\\CopyImage\\copyDoc.docx");
       int c;
       byte[] buffer = new byte[1024];
       int count =0;
       while((c= in.read(buffer)) != -1){
           System.out.println(c+ " " +(char)c);
           //out.write(c);
           out.write(buffer, 0,c);
           count++;
            }
            System.out.println("Total characters copied: " + count);
        } finally{
                if(in != null){
                in.close();
        }
        if(out != null){
                out.close();
                }
       }
       
    }
}
