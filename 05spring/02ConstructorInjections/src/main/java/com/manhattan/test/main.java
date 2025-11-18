package com.manhattan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manhattan.bean.Student;

public class main {
	
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("Myconfig.xml");
			Student s = context.getBean("eobj",Student.class);
			System.out.println(s);
	 
		}
}
