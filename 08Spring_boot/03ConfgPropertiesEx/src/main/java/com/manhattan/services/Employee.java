package com.manhattan.services;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")//to load the property file
//common prefix name checks in application.properties and if it found the key then it will inject
public class Employee {

	private int empId;
	private String name;
	private double Salary;

	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
}
