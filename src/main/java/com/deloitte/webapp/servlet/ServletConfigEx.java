package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigEx
 */

public class ServletConfigEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		ServletConfig sconfig = getServletConfig();
		writer.print("config parameters<br>");
		Enumeration<String> enumeration = sconfig.getInitParameterNames();
		String paramName=null;
		while(enumeration.hasMoreElements()) {
			paramName = enumeration.nextElement();
			writer.print(paramName+" = "+sconfig.getInitParameter(paramName)+" <br>");
		}
		
		writer.print("Context parameters<br>");
		ServletContext sc = getServletConfig().getServletContext();
		 enumeration = sc.getInitParameterNames();
		
		while(enumeration.hasMoreElements()) {
			paramName = enumeration.nextElement();
			writer.print(paramName+" "+sc.getInitParameter(paramName)+"<br>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
