package com.manhattan.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manhattan.bean.Department;

@Configuration
public class CreateDeptObj {
	@Bean
	public Department dobj() {
		Department d =new Department();
		d.setDepId(101);
		d.setName("ceo");
		return d;
		}
	
}
