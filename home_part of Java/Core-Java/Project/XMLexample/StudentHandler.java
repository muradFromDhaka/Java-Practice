/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XMLexample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author B-2
 */
public class StudentHandler extends DefaultHandler {
    private List<Student> stu = new ArrayList<>();
    private Student currentStu;
    private StringBuilder data;

    public List<Student> getStudents() {
        return stu;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (currentStu != null) {
            switch (qName.toLowerCase()) {
                case "name":
                    currentStu.setName(data.toString().trim());
                    break;
                case "age":
                    try {
                        currentStu.setAge(Integer.parseInt(data.toString().trim()));
                    } catch (NumberFormatException e) {
                        currentStu.setAge(0);// default fallback
                    }
                    break;
                case "course":
                    currentStu.setCourse(data.toString().trim());
                    break;
                case "student":
                    stu.add(currentStu);
                    currentStu = null;
                    break;
            }
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            currentStu = new Student();
            currentStu.setId(attributes.getValue("id"));
        }
        data = new StringBuilder();
    }
    
    
    
    public static void main(String[] args) {
        try {
            File xmlFile = new File("F:\\Java(Murad_1289361)\\XMLDocument\\Student.xml");
            if(!xmlFile.exists()){
                System.err.println("XML file not found: " + xmlFile.getAbsolutePath());
                return;
            }
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            StudentHandler handler = new StudentHandler();
            saxParser.parse(xmlFile, handler);
            List<Student> students = handler.getStudents();
            students.forEach(System.out::println);
            
//            for (Student x : students) {
//                System.out.println(x);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
