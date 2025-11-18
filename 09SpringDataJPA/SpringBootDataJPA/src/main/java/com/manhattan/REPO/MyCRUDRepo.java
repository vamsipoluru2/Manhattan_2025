package com.manhattan.REPO;

import org.springframework.data.repository.CrudRepository;

import com.manhattan.entity.Employee;


//T → Entity type (the class mapped to a table)

//ID → Type of the primary key (the data type of the @Id field in the entity)
public interface MyCRUDRepo extends CrudRepository<Employee, Integer>{
	
		
}
