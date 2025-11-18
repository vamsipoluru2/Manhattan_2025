package com.manhatten.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hobj")
public class HondaEngine implements Engine{
	@Value("10002")
	private int engineNo;
	@Value("HondaEngine")
	private String name;
	
	
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HondaEngine [engineNo=" + engineNo + ", name=" + name + "]";
	}
	
	
	

}
