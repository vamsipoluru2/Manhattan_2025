package com.manhattan.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhattan.bean.Libary;

public class main {

public static void main(String[] args) {
	
	//container creation
	ApplicationContext context =new ClassPathXmlApplicationContext("MyConfig.xml");
	
	Libary s1=context.getBean("Library",Libary.class);
	System.out.println(s1);
	}
}
