package JDBC.preparedstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		//step 3
//		PreparedStatement pstmt=con.prepareStatement("insert into sports values(?,?)");
//		
//		pstmt.setInt(1, 454);
//		pstmt.setString(2, "football");
//		
//		i+=pstmt.executeUpdate();// excution will be as many as obj;
//
//		pstmt.setInt(1, 555);
//		pstmt.setString(2, "handball");
		
//		i+=pstmt.executeUpdate();
		

        PreparedStatement pstmt = con.prepareStatement("UPDATE sports SET name = ? WHERE s_id = ?");
       
        pstmt.setInt(2, 455);            
        pstmt.setString(1, "Football");
        
                    
        pstmt.setInt(2, 555);
        pstmt.setString(1, "throwball");
        

        int rows = pstmt.executeUpdate();
        
        
        System.out.println(rows);
		System.out.println("Connection Establieshed");
		

		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
