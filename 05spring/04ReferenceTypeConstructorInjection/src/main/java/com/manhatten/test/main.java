package com.manhatten.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhatten.bean.Employee;

public class main {

public static void main(String[] args) {
	
	//container creation
	ApplicationContext context =new ClassPathXmlApplicationContext("Myconfig.xml");
	
	Employee s1=context.getBean("eobj",Employee.class);
	System.out.println(s1);
	}
}
