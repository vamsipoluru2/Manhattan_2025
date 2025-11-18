package com.manhatten.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


	@ComponentScan("com.manhatten")//the base pckg 
	@PropertySource("MyProperties.properties")//to 
	public class AppConfig {

	}


