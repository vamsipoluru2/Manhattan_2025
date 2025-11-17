package JDBC.BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingusingstmnt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		//step 3
		Statement stmt=con.createStatement();
		
		
		  stmt.addBatch("INSERT INTO sports (s_id, name) VALUES (101, 'legball')");
          stmt.addBatch("INSERT INTO sports (s_id, name) VALUES (102, 'Noseball')");
          stmt.addBatch("INSERT INTO sports (s_id, name) VALUES (103, 'eyeball')");
          stmt.addBatch("UPDATE sports SET name='Soccer' WHERE s_id=101");
          stmt.addBatch("DELETE FROM sports WHERE s_id=102");
          
          stmt.executeBatch();
          
          System.out.println("rows inserted");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
