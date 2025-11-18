package com.manhattan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;


@Component
public class TokenService {
	private Token token;

	@Lookup//to over come child and parent having same vslue
	public Token createTokenObject() {//return type child obj name
		return null;
	}
	
	
	@Autowired
	
	public void setToken(Token token) {
		this.token = token;
	}
	
	public Token getToken() {
		token=createTokenObject();
		return token;
	}


	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	

}


//private Token token;
//
//@Autowired
//
//public void setToken(Token token) {
//	this.token = token;
//}
//
//
//
//
//@Override
//public String toString() {
//	return "TokenService [token=" + token + "]";
//}
