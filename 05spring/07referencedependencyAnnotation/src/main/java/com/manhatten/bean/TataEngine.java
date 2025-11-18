package com.manhatten.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Tobj")
public class TataEngine implements Engine {
	
	@Value("10003")
	private int engineNo;
	@Value("TataEngine")
	private String name;
	
	
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TataEngine [engineNo=" + engineNo + ", name=" + name + "]";
	}
	
	
	

}
