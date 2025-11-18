package com.manhattan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manhattan.bean.Token;
import com.manhattan.bean.TokenService;
import com.manhattan.conf.AppConfig;

public class Main {
	 public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        TokenService T1 = context.getBean("tokenService",TokenService.class);
	        System.out.println(T1);
	        System.out.println(T1.getToken());
	        
	        
	        System.out.println("==================");

	        TokenService T2 = context.getBean("tokenService",TokenService.class);
	        System.out.println(T2);
	        System.out.println(T2.getToken());
	    }

}
