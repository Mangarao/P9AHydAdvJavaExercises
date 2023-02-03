package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	@Override
	public void destroy() {
		
		System.out.println("Destroy method is called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is My servlet";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		System.out.println("Init method code is executed");
		destroy();
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		writer.print("Context parameters");
			ServletContext sc = getServletConfig().getServletContext();
			Enumeration<String> enumeration = sc.getInitParameterNames();
			String paramName=null;
			while(enumeration.hasMoreElements()) {
				paramName = enumeration.nextElement();
				writer.print(paramName+" "+sc.getInitParameter(paramName)+"<br>");
			}
		
	}
	
	

}
