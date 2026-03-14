/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author User
 */
public class FileBinaryIo {

    public static void main(String[] args) {

    }

    public static void readWrite() throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("F:\\Desktop\\JEE-56\\Java\\Hello.docx");
            out = new FileOutputStream("F:\\Desktop\\JEE-56\\Java\\HelloCopyCat.docx");
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c + " " + (char) c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }

    public static void read() {

        File file = new File("F:\\Desktop\\JEE-56\\Java\\Hello.docx");

        try (FileInputStream fis = new FileInputStream(file)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write() {
        File file = new File("F:\\Desktop\\JEE-56\\Java\\HelloCopyCat.docx");

        try (FileOutputStream fos = new FileOutputStream(file)) {
            String content = "This is an example binary content.";
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
