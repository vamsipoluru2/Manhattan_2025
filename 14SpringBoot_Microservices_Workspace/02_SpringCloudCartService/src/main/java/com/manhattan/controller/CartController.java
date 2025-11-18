package com.manhattan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@GetMapping("/msg")
	public ResponseEntity<String> showMsgFromCart() {
		return new ResponseEntity<String>("From Cart : ", HttpStatus.OK);
	}

}
