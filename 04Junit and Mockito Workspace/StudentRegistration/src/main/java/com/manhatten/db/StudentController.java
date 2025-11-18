package com.manhatten.db;

import com.manhatten.inter.StudentService;

public class StudentController {
	private int regNo;
	private String name;
	private double fee;
	
	private StudentService ss;
	
	public StudentController(StudentService ss) {
		this.ss=ss;
	}
	
	
	public int saveStudentDetails(int regNo,String name,double fee) {
		return ss.save(regNo, name, fee);
	}
}
