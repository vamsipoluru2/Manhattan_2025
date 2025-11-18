package com.manahattan.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection con;
	public Connection getConnection()   {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		return con;
	}
	

}
