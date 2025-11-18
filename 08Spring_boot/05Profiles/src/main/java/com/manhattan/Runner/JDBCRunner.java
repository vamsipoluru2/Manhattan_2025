package com.manhattan.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manhattan.Service.JDBCConnection;


@Component
public class JDBCRunner implements CommandLineRunner{

	@Autowired
	JDBCConnection jobj;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(jobj);
		
	}

}
