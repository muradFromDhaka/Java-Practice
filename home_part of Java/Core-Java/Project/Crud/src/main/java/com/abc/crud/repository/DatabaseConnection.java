/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crud.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author B-2
 */
public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    private static final String DB_USER = "root";  // change as needed
    private static final String DB_PASSWORD = "root";   // change as needed

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
