/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import FileIO.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class FileIOUsingBufferedReaderWriteer {

    public static void main(String[] args) {

        try {
          writeFile();
//            readFile();
//           writeData();

        } catch (IOException e) {
            System.out.println("Io Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
//        writeFile02();

    }

    public static void writeFile() throws IOException {

        String[] names = {"John", "Carl", "Jerry"};

        BufferedWriter bfw = new BufferedWriter(new FileWriter("F:\\Desktop\\JEE-56\\Java\\abc.txt", true));

        for (String name : names) {
            bfw.write("Hello " + name + "!!\n");
        }
        bfw.close();
    }

    public static void readFile() throws IOException {
//        Reader reader = new InputStreamReader(new FileInputStream("F:\\Desktop\\JEE-56\\Java\\test.docx"), "utf-8");
//        BufferedReader bfr = new BufferedReader(reader);

        BufferedReader bfr = new BufferedReader(new FileReader("F:\\Desktop\\ExamLink.txt"));
        String line;
        while ((line = bfr.readLine()) != null) {
            System.out.println(line);
        }

        bfr.close();
    }

//  public string
    public static void writeData() throws IOException {
        String[] names = {"John", "Carl", "Jerry"};
//    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.append("Writing to a file.");
        writer.write("\nHere is another line.");

        for (String name : names) {
            writer.write("\n" + name);
        }
        writer.close();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile02() {

        try {
            String content = "\nHello Bangladeerwaeteartsh!! fthfghf";
            //Specify the file name and path here
            File file = new File("F:\\Desktop\\JEE-56\\Java\\xyz.txt");

            /* This logic is to create the file if the
    	 * file is not already present
             */
            if (!file.exists()) {
                file.createNewFile();
            }

            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            //Closing BufferedWriter Stream
            bw.close();

            System.out.println("Data successfully appended at the end of file");

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }

    }

    public static void writeFile03() {

	
      try{
          File file =new File("C://myfile.txt");
    	  if(!file.exists()){
    	 	file.createNewFile();
    	  }
    	  FileWriter fw = new FileWriter(file,true);
    	  BufferedWriter bw = new BufferedWriter(fw);
    	  PrintWriter pw = new PrintWriter(bw);
    	  pw.println("");
          
    	  pw.println("This is first line");
    	  pw.println("This is the second line");
    	  pw.println("This is third line");
    	  pw.close();

	  System.out.println("Data successfully appended at the end of file");

       }catch(IOException ioe){
    	   System.out.println("Exception occurred:");
    	   ioe.printStackTrace();
      }
   
    }
}
