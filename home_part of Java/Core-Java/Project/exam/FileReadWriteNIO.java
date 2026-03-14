/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 *
 * @author User
 */
public class FileReadWriteNIO {

    public static void main(String[] args) {
        readWrite();
//        read();
//        write();
    }

    public static void readWrite() {
//        Path sourceFile = Paths.get("F:\\test\\cake1.jpg");
//        Path targetFile = Paths.get("F:\\test\\testFileCopy05.jpg");
        Path sourceFile = Paths.get("F:\\test\\testFile.txt");
        Path targetFile = Paths.get("F:\\test\\testFileCopy05.txt");
        
        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.err.format("I/O Error when copying file");
        }
    }

    public static void read() {
        Path sourceFile = Paths.get("F:\\test\\testFile.txt");
        Charset charset = Charset.forName("ISO-8859-1");
        try {
            List<String> lines = Files.readAllLines(sourceFile, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void write() {
        Path targetFile = Paths.get("F:\\test\\testFileCopy.txt");
        String question = "To be or not to be?";
        Charset charset = Charset.forName("ISO-8859-1");
        try {
            Files.write(targetFile, question.getBytes());
//         List<String> lines = Files.readAllLines(targetFile, charset);
//         for (String line : lines) {
//            System.out.println(line);
//         }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
