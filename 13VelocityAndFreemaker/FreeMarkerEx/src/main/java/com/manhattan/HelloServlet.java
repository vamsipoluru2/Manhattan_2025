package com.manhattan;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private Configuration cfg;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cfg = new Configuration(new Version("2.3.32"));
        // Tell FreeMarker where to load the templates
        cfg.setServletContextForTemplateLoading(getServletContext(), "/WEB-INF/templates");
		 response.setContentType("text/html;charset=UTF-8");

	        try {
	            // Create a data model
	            Map<String, Object> dataModel = new HashMap<>();
	            dataModel.put("name", "World");

	            // Get the template and process it
	            Template template = cfg.getTemplate("hello.ftl");
	            template.process(dataModel, response.getWriter());

	        } catch (TemplateException e) {
	            throw new ServletException("Error processing FreeMarker template", e);
	        }
	}

}