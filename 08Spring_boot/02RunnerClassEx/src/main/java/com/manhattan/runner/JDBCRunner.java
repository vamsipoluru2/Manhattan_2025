package com.manhattan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class JDBCRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("I am from Jdbc Runner...");
	}
	

}
