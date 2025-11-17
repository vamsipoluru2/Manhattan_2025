package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		//step 3
		Statement stmt=con.createStatement();
		System.out.println("Connection Establieshed");
		

//		step-4
		int i = stmt.executeUpdate("INSERT INTO sports(s_id, name) VALUES (1, 'Cricket')");
		int i2 = stmt.executeUpdate("INSERT INTO sports(s_id, name) VALUES (2, 'FOOTBALL')");
		
		
		stmt.executeUpdate("update sports set name='baseball' where name='football'");
		System.out.println(i+" rows effected");
		
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
