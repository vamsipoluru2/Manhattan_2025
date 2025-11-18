package com.manhatten.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhatten.bean.Employee;
import com.manhatten.config.Appconfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Appconfig.class);//container obj
		
		Employee e=context.getBean(Employee.class);//obj of bean to get here
		System.out.println(e);
	}

}
