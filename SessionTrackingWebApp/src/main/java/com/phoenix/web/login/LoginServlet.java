package com.phoenix.web.login;

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
 *  @author vikas.prajapati
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	   String uname= request.getParameter("username");
	   String password=request.getParameter("passwd");
	   
	   PrintWriter out=response.getWriter();
	   
	   if(uname!=null && password !=null && uname.equals("vikas") && password.equals("1234"))
		   {
		   RequestDispatcher rd=request.getRequestDispatcher("welcome");
		   rd.forward(request, response);
		   out.println("<h2>Validation is Succesfull </h2>");
		   }else{
			   out.println("<h1> <style='color:red'>Invalid Login</h1>");
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
