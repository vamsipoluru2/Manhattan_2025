package com.manhatten.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manhatten.bean.JDBCProperties;
import com.manhatten.conf.AppConfig;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		JDBCProperties jobj=context.getBean("jobj",JDBCProperties.class);
		System.out.println(jobj);
	}

}
