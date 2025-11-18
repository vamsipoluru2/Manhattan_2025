package com.manhattan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	@GetMapping("/book")
	public String ShowBook(@RequestParam(value="bname",required=false) String bname,
							@RequestParam(value="auth",required=false) String auth, Model model) {
		model.addAttribute("bname",bname);
		model.addAttribute("auth",auth);
		return "ShowBook";
	}
}