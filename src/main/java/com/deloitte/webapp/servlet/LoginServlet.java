package com.deloitte.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			String uname = request.getParameter("username");
			String password = request.getParameter("password");
			PrintWriter writer = response.getWriter();
			
			if("manga".equals(uname) && "123".equals(password)) {
				writer.println("Login Successful");
				//Request dispatching..
				RequestDispatcher rd = request.getRequestDispatcher("/welcome");
				//request.setAttribute("keyword", request.getParameter("keyword"));
				rd.forward(request, response);
				//response.sendRedirect("http://google.com");
				
				
			}else {
				writer.println("Login Failure");
				writer.println("<a href='login.html'> Click here to Login </a>");
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
