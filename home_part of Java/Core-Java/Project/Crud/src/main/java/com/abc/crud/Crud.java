/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.abc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;

/**
 *
 * @author B-2
 */
public class Crud {

    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    private static final String DB_USER = "root";  // change as needed
    private static final String DB_PASSWORD = "root";   // change as needed

    public static void main(String[] args) {
        String insertSQL = "INSERT INTO users (name, email) VALUES (? , ?)";
        String selectSQL = "SELECT * FROM users";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to the database");

            //Insert sample data 
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setString(1, "Alice");
            insertStmt.setString(2, "alice@gmail.com");
            insertStmt.executeUpdate();
            insertStmt.setString(1, "Jonh");
            insertStmt.setString(2, "jonh@gmail.com");
            insertStmt.executeUpdate();
            System.out.println("Inserted record successfully...");

            //Fetch and display data
            PreparedStatement selecttStmt = conn.prepareStatement(selectSQL);
            ResultSet rs = selecttStmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
