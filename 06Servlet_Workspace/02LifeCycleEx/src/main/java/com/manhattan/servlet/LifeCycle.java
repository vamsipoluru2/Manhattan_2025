package com.manhattan.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycleUrl")
public class LifeCycle extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("InIt Method,Initialized");
		}
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().println("<h1>Welcome To first Application of Lifecycle<h1>");
		System.out.println("Service Method");
		
	}
	
	@Override
		public void destroy() {
		System.out.println("Destroy method called...");
	}

}
