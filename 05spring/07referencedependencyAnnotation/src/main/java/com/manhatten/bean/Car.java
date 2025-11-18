package com.manhatten.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("BMW")
	private String name;
	@Autowired
	@Qualifier("Tobj")//provide which obj to be in engine interface
	private Engine engine;

	public void setName(String name) {
		this.name = name;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	
	
	
}
