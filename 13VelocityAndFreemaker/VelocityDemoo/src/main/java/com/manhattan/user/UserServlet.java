package com.manhattan.user;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import com.manhattan.user.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
		private static final long serialVersionUID = 1L;

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 // Initialize Velocity engine
	        VelocityEngine ve = new VelocityEngine();
	        ve.setProperty("file.resource.loader.path", getServletContext().getRealPath("/WEB-INF/templates"));
	        ve.init();

	        // Create sample data
	        List<User> users = new ArrayList<>();
	        users.add(new User("Alice","alice@example.com"));
	        users.add(new User("Bob","bob@example.com"));
	        users.add(new User("Charlie","charlie@example.com"));

	        // Create context and add data
	        VelocityContext context = new VelocityContext();
	        context.put("users", users);

	        // Merge template
	        StringWriter writer = new StringWriter();
	        ve.mergeTemplate("user_list.vm", "UTF-8", context, writer);

	        // Set response content type
	        response.setContentType("text/html");
	        response.getWriter().write(writer.toString());
		}

	
}
