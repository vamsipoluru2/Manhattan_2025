package com.manhattan.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USER = "root";  // your MySQL username
    private static final String PASSWORD = "Root"; // your actual MySQL password

    public static Connection getConnection() {
        Connection con = null;
        try {
        	 System.out.println("✅ Attempting DB connection...");  // 🔹 Add here
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ required for MySQL 8+
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace(); // this will print the real reason in Tomcat console/logs
        }
        return con;
    }
}
