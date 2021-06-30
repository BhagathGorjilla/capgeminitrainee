package com.bg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetServlet
 */
@WebServlet("/greet")
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetServlet() {
        super();
        System.out.println("instance created");
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	System.out.println("init called");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get invoked");
		PrintWriter out=     response.getWriter() ;
		out.println("<h1>Hello World from greet");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    System.out.println("post invoked");
		String name = request.getParameter("t1");
		PrintWriter out=     response.getWriter() ;
		out.println("<h1>Hello World from post method"+name);
	
	}

}
