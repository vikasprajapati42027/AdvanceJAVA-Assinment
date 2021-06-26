package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.web.models.LoginBean;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	  //response.setContentType("text/html");
	  
	  String uname=request.getParameter("username");
	  String password=request.getParameter("passwd");
	  
	  LoginBean obj1=new LoginBean();
	  request.setAttribute("ob", obj1);
	  obj1.setUsername(uname);
	  obj1.setPassword(password);  
	  PrintWriter out=response.getWriter();
	  
	  if(obj1.isValid())
	  {
		  RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		  rd.forward(request, response);
	  }else {
		  out.println("<h3 style='color:red;'>Invalid Login</h3>");
		  RequestDispatcher rd=request.getRequestDispatcher("login.html");
		  rd.include(request, response);
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
