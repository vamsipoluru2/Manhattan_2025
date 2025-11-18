package com.manhattan.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//if scope not given it is singleton
public class Token {
	public int token;


	public Token(){
		token = new Random().nextInt(999);
		 System.out.println("Token created");
	}


	@Override
	public String toString() {
		return "Token [token=" + token + "]";
	}
	
	
}
