package com.manhattan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//emp+get
	@RequestMapping("/emp")
	public String ShowEMp() {
		return "EmPage";
	}
	
	//Home+get
	@RequestMapping("/Home")
	public String showHome() {
		return "HomePage";
	}
	
	//save+post
	
	@PostMapping("/save")
	public String saveUser() {
		return "UserPage";
	}
	
}
