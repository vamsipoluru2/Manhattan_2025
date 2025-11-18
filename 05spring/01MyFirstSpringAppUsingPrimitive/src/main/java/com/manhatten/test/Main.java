package com.manhatten.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhatten.bean.Employee;

public class Main {
	public static void main(String[] args) {
		
	//container creation
	ApplicationContext context =new ClassPathXmlApplicationContext("MyConfig.xml");
	
	
	//container
	Employee e= context.getBean("emp",Employee.class);//calling with name
	Employee e1= (Employee) context.getBean("emp1");//Explicit casting;
	System.out.println(e);
	System.out.println(e1);
	}

}
