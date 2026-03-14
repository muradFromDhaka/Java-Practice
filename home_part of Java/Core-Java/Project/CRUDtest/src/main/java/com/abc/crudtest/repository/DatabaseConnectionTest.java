/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crudtest.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author B-2
 */
public class DatabaseConnectionTest {
    public static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";
    
    public static Connection getConnetion() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
               e.printStackTrace();
        }
        
       return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
    }
    
}
