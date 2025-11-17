package JDBC.preparedstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementdemo3 {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		
		

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter sport name to update: ");
        String sportName = sc.nextLine();

        System.out.print("Enter new s_id: ");
        int sid = sc.nextInt();


        
        PreparedStatement pstmt = con.prepareStatement("UPDATE sports SET s_id = ? WHERE name = ?");
 
        pstmt.setInt(1, sid);          
        pstmt.setString(2, sportName); 

       
		
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
