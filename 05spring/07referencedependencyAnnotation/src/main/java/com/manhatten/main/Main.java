package com.manhatten.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manhatten.bean.Car;
import com.manhatten.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
				Car c=context.getBean("car",Car.class);
				System.out.println(c);
	}
}
