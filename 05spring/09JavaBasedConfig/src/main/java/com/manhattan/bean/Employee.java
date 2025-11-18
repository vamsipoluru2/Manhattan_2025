package com.manhattan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eobj")
public class Employee {
	
	@Value("1001")
	private int id;
	@Value ("sai")
	private String name;
	@Autowired
	private Department dep;//obj is injected 

	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	
	

}
