package JDBC.preparedstmt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Storeimgformdb {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		
        PreparedStatement pstmt = con.prepareStatement("select * from image");
        
        
        
		
        ResultSet rows = pstmt.executeQuery();
        rows.next();
        String imagename=rows.getString(1);
        Blob image=rows.getBlob(2);
        FileOutputStream fos=new FileOutputStream("C://manhatten_learnings//jdbc//MyFirstJDBCAppUsingStatement//src//output//"+imagename +".jpg");
		fos.write(image.getBytes(1, (int)image.length()));
		
		
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}

