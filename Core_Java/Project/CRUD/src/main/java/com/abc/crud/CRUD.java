package com.abc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {

    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    private static final String DB_USER = "root";        // change as needed
    private static final String DB_PASSWORD = "root"; // change as needed

    public static void main(String[] args) {
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String selectSQL = "SELECT * FROM users";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to the database.");

            // Insert sample data
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setString(1, "Jon the Don");
            insertStmt.setString(2, "Jon@don.com");
            //INSERT INTO users (name, email) VALUES ('Alice', 'alice@gmail.com')
            insertStmt.executeUpdate();
            System.out.println("Inserted record successfully.");

            // Fetch and display data
            PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
            ResultSet rs = selectStmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " 
                        + name + ", Email: " + email);
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
