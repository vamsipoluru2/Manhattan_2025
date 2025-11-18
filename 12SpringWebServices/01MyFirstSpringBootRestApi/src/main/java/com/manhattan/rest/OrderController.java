package com.manhattan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/fetch")
	public ResponseEntity<String> FetchOrderData(){
		ResponseEntity<String> rs=new ResponseEntity<String>("Order data fetched Sucessfully",HttpStatus.OK);
		return rs;
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<String> createOrder(){
		return new ResponseEntity<String>("Order Created!..", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateFullOrderRecord(){
		return new ResponseEntity<String>("Order Updated Sucessfully!..", HttpStatus.OK);
	}
	
	@PatchMapping("/patch")
	public ResponseEntity<String> updateNameRecord(){
		return new ResponseEntity<String>("Name Updated Sucessfully!..", HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteOrderRecord(){
		return new ResponseEntity<String>("Order Deleted Sucessfully!..", HttpStatus.OK);
	}
}
