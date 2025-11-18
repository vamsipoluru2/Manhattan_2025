package com.manhattan.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manhattan.bean.Employee;
import com.manhattan.conf.Appconfg;

public class main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfg.class);
		Employee e=context.getBean("eobj",Employee.class);
		System.out.println(e);
		}

	}

