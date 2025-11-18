package com.manhattan.Runner;
import com.manhattan.SpringBootDataJpaApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.manhattan.REPO.MyCRUDRepo;
import com.manhattan.entity.Employee;

@Component
public class MyRunner implements CommandLineRunner {

    private final SpringBootDataJpaApplication springBootDataJpaApplication;

	@Autowired 
	MyCRUDRepo myrepo;

    MyRunner(SpringBootDataJpaApplication springBootDataJpaApplication) {
        this.springBootDataJpaApplication = springBootDataJpaApplication;
    }
	@Override
	public void run(String... args) throws Exception {

//		System.out.println(myrepo.getClass().getName());
//
//		Employee e=new Employee(1001,"elon",100000);
//		myrepo.save(e);
//		
//		//adding 3 obj at a time due every time we execute it will delete the table data so we are passing as a list of multiple obj 
//		List<Employee> emp=Arrays.asList(new Employee(1000,"grok",20000),new Employee(1002,"open ai",300000),new Employee(1004,"gemini",500000));
//		myrepo.saveAll(emp);
//		
//		Iterable<Employee> i=myrepo.findAll();
//		i.forEach(System.out::println);
		
//		System.out.println(myrepo.count());
//		System.out.println(myrepo.existsById(1003));
//		
//		Optional<Employee> p=myrepo.findById(1004);
//		
//		System.out.println(p.get());
//		myrepo.delete(e);
		myrepo.deleteAll();
		
	}

}
