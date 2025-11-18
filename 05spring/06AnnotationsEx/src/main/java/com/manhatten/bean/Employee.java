package com.manhatten.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //at class level
public class Employee {
	

	@Value("1001")//dependencies
	private int empId;
	@Value("Sanjay")
	private String name;
	@Value("pso")
	private String dept;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}

}
