package usingStirngBuilder.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import usingStirngBuilder.bean.StringClass;
import usingStirngBuilder.conf.Appconf;
import usingStirngBuilder.test.StringTest;

public class Main {
	public static void main(String[] args) {
		
				ApplicationContext context=new AnnotationConfigApplicationContext(Appconf.class,StringTest.class);
				StringClass e=context.getBean(StringClass.class);
				e.printMessage();
				


	}
}
