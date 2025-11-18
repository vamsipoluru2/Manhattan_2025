package com.manhattan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data //to generate getters and setters tosting
@Component
@ConfigurationProperties("my.app")
public class Product {
	private int empId;
	private String name;
	private double Salary;
	private List<String> branch;
	private Set<String> sport;
	private String studentcolour[];
	private ArrayList<String> section;
	private Map<String,String> flag;
	private Properties PropName;
	
	private Vendor V;//obj is created in product so @component is not needed in vendor class  

}
