package com.manhattan.controller; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manhattan.bean.Employee;


@Controller//to create obj and provide http support
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/show")
	public String showData(Model model) {
		System.out.println("========>"+model.getClass().getName());
		
		model.addAttribute("eid",1001);
		model.addAttribute("ename","Elon");
		model.addAttribute("Esal",50000.0);
		
		Employee emp=new Employee(102,"sundar",20000.0);
		model.addAttribute("employee", emp);
		
		return "EmpPage";
	}
	

}
