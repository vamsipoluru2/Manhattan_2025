package com.manhattan.opr;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manhattan.entity.Employee;

public class DatabaseOperation {
	
	public static void main(String[] args) {
	
	EntityTransaction et=null;
	try {
	//1.(load Driver, get Connection, Create Statement)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeDB");
	EntityManager em=emf.createEntityManager();
	
	et=em.getTransaction();
	et.begin();
	
	Employee e=new Employee();
	e.setEmpid(1001);
	e.setName("Rahul");
	e.setSalary(20000);
	
	em.persist(e);
	et.commit();
	
	
	}catch(Exception e){
		e.printStackTrace();
		et.rollback();
	}
	
	}
}
