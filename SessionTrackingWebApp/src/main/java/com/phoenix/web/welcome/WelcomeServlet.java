package com.phoenix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String uname=request.getParameter("username");
	
	HttpSession session=request.getSession();
	session.setMaxInactiveInterval(3);
	
	System.out.println("Session Id :" +session.getId());
	
	session.setAttribute("user", uname);
	
	String encodeProductUrl=response.encodeURL("products");
	PrintWriter out=response.getWriter();
	
	out.println("<body>"+
		        "<h1>Session time out :"+session.getMaxInactiveInterval()+"</h1>"+
		        "<h3>To enjoy shopping <a href='"+encodeProductUrl+"'>click </a><h3>"+uname+"welcome to Page</h1>"+
			"</body>");
		//response.sendRedirect("https://www.google.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
