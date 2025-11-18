package com.manhattan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryString
 */
@WebServlet("/QueryStringUrl")
public class QueryString extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
		String uname=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		
		res.setContentType("text/html");
		if(uname.equalsIgnoreCase("vamsi")&&pwd.equalsIgnoreCase(pwd)) {
			res.getWriter().println("<h3><font color=Green>Login Success..");
		}
		else {
			res.getWriter().println("<h3><font color=red>Login unSuccess...");

		}
	}
	
	//service non life methods
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
 