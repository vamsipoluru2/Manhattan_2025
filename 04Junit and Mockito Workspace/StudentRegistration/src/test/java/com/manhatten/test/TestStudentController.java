package com.manhatten.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.manhatten.db.StudentController;
import com.manhatten.inter.StudentService;

public class TestStudentController {
	@Mock
	private StudentService ss;
	@InjectMocks
	private StudentController sc;
	
	@Test
	public void testsaveStudentDetails() {
		when(sc.saveStudentDetails(101, "vasmi",	30000)).thenReturn(1);
		assertEquals(1, sc.saveStudentDetails(101, "vasmi", 30000));
		
	}
	
}
