package com.manhattan.bean;


public class Department {
	private int depId;
	private String name;
	

	public void setDepId(int depId) {
		this.depId = depId;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Department [depId=" + depId + ", name=" + name + "]";
	}
	
	
}
