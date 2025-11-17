package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionCheck {

	public static void main(String[] args) {
		
//		This is the fully qualified class name of the MySQL JDBC driver provided by MySQL Connector/J.
//		com.mysql.cj.jdbc → the package name where the driver class lives.

		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:myql://localhost:3306/amrita","root","Root");
		//step 3
		Statement stmt=con.createStatement();
		System.out.println("connection Establieshed");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
