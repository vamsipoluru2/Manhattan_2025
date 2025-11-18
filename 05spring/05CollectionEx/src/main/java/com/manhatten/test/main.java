package com.manhatten.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhatten.bean.Product;

public class main {

public static void main(String[] args) {
	
	//container creation
	ApplicationContext context =new ClassPathXmlApplicationContext("Myconfig.xml");
	
	Product s1=context.getBean("eobj",Product.class);
	System.out.println(s1);
	}
}
