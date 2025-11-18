package com.manhattan.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.manhattan.Bean.Student;
 
@Controller
public class RegisterController {
	
	@GetMapping("/register")
	public String registerStudent() {
		return "registerPage";
	}
	@PostMapping("/save")
	public String showStdentDetails(@ModelAttribute Student student,Model model) {
		model.addAttribute("student", student);
		return "ShowJsp";
	}
}

