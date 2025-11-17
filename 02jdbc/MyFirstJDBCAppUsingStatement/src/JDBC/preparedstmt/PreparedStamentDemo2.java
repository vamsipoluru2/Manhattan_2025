package JDBC.preparedstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStamentDemo2 {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your SQL query:");
		String sql = sc.nextLine();

        PreparedStatement pstmt = con.prepareStatement(sql);

        int rows = pstmt.executeUpdate();
        
        System.out.println(rows);
		System.out.println("Connection Establieshed");
		

		
		sc.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	

}
