package com.manhattan.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manhattan.bean.Library;
import com.manhattan.conf.Appconfg;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Appconfg.class);
		Library e=context.getBean("lib",Library.class);
		System.out.println(e);
	}

}
