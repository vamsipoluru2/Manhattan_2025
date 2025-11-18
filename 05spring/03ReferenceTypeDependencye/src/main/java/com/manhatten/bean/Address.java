package com.manhatten.bean;

public class Address {
	private int dNo;
	private String area;
	private String city;
	
	
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", area=" + area + ", city=" + city + "]";
	}
	
	
	
}
