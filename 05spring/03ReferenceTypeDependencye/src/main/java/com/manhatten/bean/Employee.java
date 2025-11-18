package com.manhatten.bean;

public class Employee {
	private int id;
	private String name;
	private double salary;
	Address a;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", a=" + a + "]";
	}
	
	
	
}
