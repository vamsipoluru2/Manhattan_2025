package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset {
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
		
		//to see int the conslole we use result set
		ResultSet rs=stmt.executeQuery("select * from sports");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2) );
		}
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
