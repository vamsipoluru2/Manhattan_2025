package com.manhattan.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manhattan.entity.Employee;

public interface MyCRUDRepo extends CrudRepository<Employee, Integer>{
	
//	@Query("Select e from Employee e")
	@Query("from Employee")
	public List<Employee> getAll();
	
	@Query("select name from Employee where salary>300")
	public List<String> getNames();
	
	@Query("select name,salary from Employee where salary>2000 ")
	public List<Object[]> getNameandSalary();
	

		
}
