package com.manhatten.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.manahattan.db.DBConnection;

public class TestDBConnection {
	private static DBConnection db;

	@BeforeAll
	public static void setUpOnce() {
		db=new DBConnection();
	}
	@Test
	public void testGetConnection() throws ClassNotFoundException,SQLException {
		assertDoesNotThrow(()->{db.getConnection();});
		assertNotNull(db.getConnection(),"got null");
		
	}
	@AfterAll
	public static void clear() {
		db=null;
	}
	
	

}
