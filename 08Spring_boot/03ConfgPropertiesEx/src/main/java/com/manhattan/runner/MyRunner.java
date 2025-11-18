package com.manhattan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manhattan.services.Employee;


@Component
public class MyRunner implements CommandLineRunner{

	@Autowired //to automatic injection of container it will inject the employee e
	Employee e;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(e);
	}

}
