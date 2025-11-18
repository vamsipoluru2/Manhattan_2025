package com.manhatten.bean;

public class Employee {

	private int id;
	private String name;
	private double salary;
	Address a;
	
	

	public Employee(int id, String name, double salary, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.a = a;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", a=" + a + "]";
	}
}
