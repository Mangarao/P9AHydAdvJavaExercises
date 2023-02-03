package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(name = "ws", urlPatterns = { "/welcome" })
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<br/> Welcome to DTA Launchpad program.. You guys are awesome!!");
		//dispatching the request to google server
		String key = request.getParameter("keyword");
		response.sendRedirect("https://www.google.com/search?q="+key);
		

		/*
		 * String number1 = request.getParameter("number1"); String number2 =
		 * request.getParameter("number2"); int a = Integer.parseInt(number1); int b =
		 * Integer.parseInt(number2); PrintWriter writer = response.getWriter();
		 * writer.printf("Sum of two numbers  of %d, %d is %d", a, b, (a+b));
		 */
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
