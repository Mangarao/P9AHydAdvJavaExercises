package com.deloitte.webapp.servlet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter(filterName = "servlet1", urlPatterns = { "/servlet1" })
public class MyFilter extends HttpFilter implements Filter {
       
	int clicks=0;
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		//Action to perform preprocessing request
		response.setContentType("text/html");
		response.getWriter().print("No. of clicks of this website: "+(++clicks));
		System.out.println("This message executed before processing the request");
		//response.getWriter().print("<h1 style='color:red'>Sorry, The website is under maintenance.. Plese try later<h1>");
		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.print("Requesting proccessing time: "+(endTime-startTime));
		System.out.println("This message executed after processing the request");
		//Action to perform post processing request
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
