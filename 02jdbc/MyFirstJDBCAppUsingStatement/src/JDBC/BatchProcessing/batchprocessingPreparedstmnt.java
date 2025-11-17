package JDBC.BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class batchprocessingPreparedstmnt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1 load driver class
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrita","root","Root");
		//step 3
		Statement stmt=con.createStatement();//for select query
		
		
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO sports (s_id, name) VALUES (?, ?)");

        pstmt.setInt(1, 1001);
        pstmt.setString(2, "Football2");
        pstmt.addBatch();

        pstmt.setInt(1, 1002);
        pstmt.setString(2, "Hockey2");
        pstmt.addBatch();

        pstmt.setInt(1, 1003);
        pstmt.setString(2, "Cricket2");
        pstmt.addBatch();
        
        
        int [] i=pstmt.executeBatch();
        
        for(int j:i) {   
        	System.out.println(j+"rows inserted!..");
        }
          System.out.println("rows inserted");
          
		
          // Step 4: Execute a query to retrieve the data
          String selectQuery = "SELECT * FROM sports";
          ResultSet rs = stmt.executeQuery(selectQuery);

          // Step 5: Process the ResultSet
          while (rs.next()) {
              // Retrieve data by column name
              int id = rs.getInt("s_id");
              String name = rs.getString("name");

              // Display values
              System.out.println("ID: " + id + ", Name: " + name);
          }
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
