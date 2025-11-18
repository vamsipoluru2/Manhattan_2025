package com.manhattan;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

/**
 * Servlet implementation class FreemarkerServlet
 */
@WebServlet("/FreemarkerServlet")
public class FreemarkerServlet extends HttpServlet {
	  private Configuration cfg;
	    @Override
	    public void init() {
	        // Create and configure the FreeMarker configuration object
	        cfg = new Configuration(new Version("2.3.32"));
	        // Specify the directory where templates are located
	        cfg.setServletContextForTemplateLoading(getServletContext(), "/WEB-INF/templates");
	       
	    }

		private static final long serialVersionUID = 1L;

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        
	        // 1. Create the data model
	        Map<String, Object> dataModel = new HashMap<>();
	        dataModel.put("user", "Application User");
	        dataModel.put("message", "This is a message from a servlet.");

	        List<String> itemList = new ArrayList<>();
	        itemList.add("KEY BOARD");
	        itemList.add("MOUSE");
	        itemList.add("MONITOR");
	        dataModel.put("items", itemList);

	        // 2. Get the template
	        try {
	            Template template = cfg.getTemplate("template.ftl");
	            
	            // 3. Merge the template with the data model and send to the browser
	            Writer out = response.getWriter();
	            template.process(dataModel, out);
	            out.flush();
	            
	        } catch (TemplateException e) {
	            throw new ServletException("Error processing FreeMarker template", e);
	        }

		}

}