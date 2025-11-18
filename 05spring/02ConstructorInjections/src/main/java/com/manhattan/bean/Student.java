package com.manhattan.bean;
 
public class Student {
	private int regNo;
	private String name;
	private int fee;
 
	//Constructor We need so constructor with fields
	public Student(int regNo, String name, int fee) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.fee = fee;
	}
	
	
 
	//override toString
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", fee=" + fee + "]";
	}
 
}