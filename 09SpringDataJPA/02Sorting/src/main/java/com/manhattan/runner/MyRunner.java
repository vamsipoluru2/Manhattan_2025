
package com.manhattan.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.manhattan.entity.Book;
import com.manhattan.repo.MyRepo;

public class MyRunner implements CommandLineRunner {
 
 @Autowired
 MyRepo repo;

 @Override
 public void run(String... args) throws Exception {
  
	 repo.saveAll(Arrays.asList(new Book(101,"Java",200),
			    new Book(102,"Python",200),
			    new Book(103,"Html",200),
			    new Book(104,"CSS",200)));
	 
	 Sort s1=Sort.by(Direction.DESC,"id" );
//	 repo.findAll(s1).forEach(System.out::println);
 }

}
 