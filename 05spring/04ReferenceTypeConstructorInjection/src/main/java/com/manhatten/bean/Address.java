package com.manhatten.bean;

public class Address {
	private int dNo;
	private String area;
	private String city;
	
	


	
	
	public Address(int dNo, String area, String city) {
		super();
		this.dNo = dNo;
		this.area = area;
		this.city = city;
	}






	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", area=" + area + ", city=" + city + "]";
	}
	
}
