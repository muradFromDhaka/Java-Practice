/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XMLexample;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author B-2
 */
public class SAXExample extends DefaultHandler {

    private String currentElement;
    private StringBuilder currentText;
    private String currentStudentId;
    private String currentName;
    private String currentAge;
    private String CurrentCourse;
    private boolean inStudent = false;
    private int studentCount = 0;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentText != null) {
            currentText.append(ch, start, length);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String text = currentText.toString().trim();

        if (inStudent) {
            switch (qName) {
                case "name":
                    currentName = text;
                    System.out.println("Name : " + currentName);
                    break;
                case "age":
                    currentAge = text;
                    System.out.println("Age : " + currentAge);
                    break;
                case "course":
                    CurrentCourse = text;
                    System.out.println("Course : " + CurrentCourse);
                    break;
                case "student":
                    inStudent = false;
                    //Reset values for next student
                    currentStudentId = null;
                    currentName = null;
                    currentAge = null;
                    CurrentCourse = null;
                    break;
            }
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = qName;
        currentText = new StringBuilder();

//        System.out.println("Element Name: " + currentElement);
//        System.out.println("Attribute Value: " + attributes.getValue("id"));

        if ("student".equals(qName)) {
            inStudent = true;
            studentCount++;
            currentStudentId = attributes.getValue("id");
            System.out.println("\n---- Student # " + studentCount + "-----");
            System.out.println("ID: " + currentStudentId);

        }

    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    
    
    
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            //create custom handler;
            SAXExample handler = new SAXExample();

            // Parse the XML file
            saxParser.parse("F:\\Java(Murad_1289361)\\XMLDocument\\Student.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
