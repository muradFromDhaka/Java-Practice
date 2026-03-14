/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextIOEx;

import com.abc.myfirstproject.entity.Dog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author B-2
 */
public class TextIOExampleClass {

    public static void main(String[] args) {
        try {
            bufferedFileIO();
        } catch (Exception e) {
            System.out.println("I/O error : " + e.getMessage());
        }
    }

    // 1. Console I/O
    public static void consoleIO() {
        System.out.println("=== Console I/O ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "!");
        System.out.println("Age is= " + age + "!");

        scanner.close();
        System.out.println();
    }

    // 2. File I/O using BufferedWriter and BufferedReader;
    public static void bufferedFileIO() throws IOException {

        String filePath = "C:\\Users\\B-2\\Desktop\\FileOutput\\MyFirstFile3.txt";

        // Writing
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        writer.write("Line one using BufferedWriter.");
        writer.newLine();
        writer.write("Line two using BufferedWriter.");
        writer.close();

        // Reading
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Read: " + line);
        }
        reader.close();
        System.out.println();

        // Reading Writing;
        String OldFilePath = "C:\\Users\\B-2\\Desktop\\FileOutput\\MyFirstFile3.txt";
        String newFilePath = "C:\\Users\\B-2\\Desktop\\FileInPut\\abc\\xyz\\Inputed.txt";

        // Ensure the destination directory exists;
         File newFile = new File(newFilePath);
         File parentDir = newFile.getParentFile();
         if(!parentDir.exists()){
             if(parentDir.mkdirs()){
                 System.out.println("Created directory: " + parentDir.getAbsolutePath());
             }else{
                 System.out.println("Failed to create directory: " + parentDir.getAbsolutePath());
                 return;
             }
         }
        
        BufferedReader reader1 = new BufferedReader(new FileReader(OldFilePath));
        BufferedWriter w = new BufferedWriter(new FileWriter(newFilePath));

        String line1;
        while((line1 = reader1.readLine()) != null){
            w.write(line1);
            w.newLine();
        }
        w.close();
        reader1.close();
        System.out.println("");
    }
}
