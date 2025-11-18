package com.manhatten.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhatten.bean.Students;

public class Main {
	public static void main(String[] args) {
		
	//container creation
	ApplicationContext context =new ClassPathXmlApplicationContext("MyConfig.xml");
	
	Students s1=context.getBean("stu",Students.class);
	System.out.println(s1);
	}
}