package com.manhattan.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manhattan.Repo.MyCRUDRepo;
import com.manhattan.entity.Employee;

@Component
public class MyRunner implements CommandLineRunner{

	@Autowired
	MyCRUDRepo myRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(myRepo.getClass().getName());
		
		//fetch all records 
		List<Employee> emp=myRepo.getAll();
		emp.forEach(System.out::println);
		
		System.out.println("=================");
		//fetch one col
		List<String> L2=myRepo.getNames();
		L2.forEach(System.out::println);
		
		System.out.println("===========/========");
		
		List<Object []> l2=myRepo.getNameandSalary();
		for(Object row[] : l2) {
		    System.out.println(row[0] + " "+ row[1]);
		}

		
	}

}
