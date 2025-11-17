package JDBC.preparedstmt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedstmtimage {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		
        PreparedStatement pstmt = con.prepareStatement("insert into image values(?,?)");
        
        File file=new File("C://manhatten_learnings//jdbc//MyFirstJDBCAppUsingStatement//src//virat2.jpg");
        FileInputStream fis=new FileInputStream(file);//to read binary data we need inputstream; for output we need output stream
        
        pstmt.setString(1, "Virat");
        pstmt.setBinaryStream(2, fis);
       
		
        int rows = pstmt.executeUpdate();
        System.out.println(rows);

		System.out.println("Image inserted");
		//to see image retrieve form data base to check it is fetch from data base
		
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
