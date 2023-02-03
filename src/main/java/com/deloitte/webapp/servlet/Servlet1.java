package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(name = "servlet1", urlPatterns = { "/servlet1" })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		
		Cookie c=new Cookie("username", uname);
		response.addCookie(c);
		
		
		PrintWriter  pw =  response.getWriter();
		pw.println("Welcome, "+uname);
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);
		pw.println("<a href='servlet2'> Click here for 2nd resource </a>");
		
		/*
		 * pw.println("<form action='servlet2' method='post'>");
		 * pw.println("<input type='hidden' name='uname' value='"+uname+"'/>");
		 * pw.println("<input type='submit' value='Go to Second resource'/>");
		 * pw.println("</form>");
		 */
		
		
		
		
		
		
		
	}

}
