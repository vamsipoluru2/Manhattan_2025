package com.manhatten.bean;

public class Employee {
	private int EmpId;
	private String name;
	private double salary;
	
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//primitive dependency with setter injection
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + "]";
	}
}
