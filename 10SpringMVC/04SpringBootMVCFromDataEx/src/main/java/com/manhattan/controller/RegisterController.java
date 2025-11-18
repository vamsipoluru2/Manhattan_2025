package com.manhattan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.manhattan.Application;
import com.manhattan.bean.Student;

@Controller
public class RegisterController {


	
	@GetMapping("/register")
	public String registerStudent() {
		return "registerPage";
	}
	
	@PostMapping("/save")//from model attribute saving to 
	public String showStdentDetails(@ModelAttribute("student") Student st,Model model) {
		//model is used to show the data in jsp page received form model 
		model.addAttribute("student", st);//sending student obj to show jspapplication
		//if class name is diff the syntax changes @MOdelAtttributr("obj name") class name local var
		return "ShowJsp";
	}
}
