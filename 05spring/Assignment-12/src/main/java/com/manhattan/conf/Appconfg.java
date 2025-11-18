package com.manhattan.conf;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//container will scan all the values of component 


@Configuration
@ComponentScan("com.manhattan")
@PropertySource("MyProperties.properties")//to 
public class Appconfg {
	
	 }
