package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

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
		boolean res=stmt.execute("create table sports(s_id int,name varchar(20));");//query should pass
		
		if(res==true)System.out.println("check the syntax !...");//when select cmd sql returns true
		//non select cmd it gives false like rows effected 
		else System.out.println("table created ");
		
		
		int i=stmt.executeUpdate("create table canteen(s_id int,name varchar(20))");
		System.out.println("table created");
		if(i==1)System.out.println("check the syntax !...");
		
		else System.out.println("table created ");
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
