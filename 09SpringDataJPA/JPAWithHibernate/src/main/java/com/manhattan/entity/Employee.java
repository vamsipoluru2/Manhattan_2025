package com.manhattan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="emptable")
public class Employee {
	@Id
//	@Column(name="eid")
	private int empid;
//	@Column(name="ename")
	private String name;
//	@Column(name="sal")
	private double salary;
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}