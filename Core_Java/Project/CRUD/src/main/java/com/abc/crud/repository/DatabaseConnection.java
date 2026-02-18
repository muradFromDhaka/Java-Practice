package com.abc.crud.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3307/test";
    private static final String USER = "root"; // Change this to your MySQL username
    private static final String PASSWORD = "root"; // Change this to your MySQL password

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error in DatabaseConnection: " + e.getMessage());
        }
        return null;
    }
}
