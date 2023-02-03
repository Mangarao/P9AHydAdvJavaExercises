package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/*
		 * PrintWriter pw = resp.getWriter();
		 * pw.println("<h1> Welcome to Demo Servlet<h1>");
		 * pw.println("<p>Java EE is for developing web and enterprise apps</p>");
		 */
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.print("Context parameters");
		ServletContext sc = getServletConfig().getServletContext();
		Enumeration<String> enumeration = sc.getInitParameterNames();
		String paramName = null;
		while (enumeration.hasMoreElements()) {
			paramName = enumeration.nextElement();
			writer.print(paramName + " " + sc.getInitParameter(paramName) + "<br>");
		}

	
	}
	
	

}
