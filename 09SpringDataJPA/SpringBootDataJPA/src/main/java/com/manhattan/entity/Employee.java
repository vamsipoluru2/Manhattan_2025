package com.manhattan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	//@Column(name="eid")
	private Integer empid;
	//@Column(name="ename")
	private String name;
	//@Column(name="sal")
	private double salary;

}
