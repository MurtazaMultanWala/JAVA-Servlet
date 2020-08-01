package com.murtaza;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
	Writing XML code to configure servlet is not suitable for everyone. So writing XML code to configure all the servlets
	and mappings with their URL, it is better to use annotation form in which we just needed to write the URI and all
	configuration is done by itself. That Cool !! isn't it. :).
*/

@WebServlet("/add")  
public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		int addNumber = firstNumber + secondNumber;
		
/*		System.out.println("Result is: "+ addNumber); //for console
		PrintWriter out = res.getWriter();
		out.println("Result is: "+ addNumber)
*/
		
		/* 	What if you want to pass data from one servlet to another we need to create a session Management 
		 	or we are passing HttpServletRequest object so why not send this data with it. 
			
			req.setAttribute("sumResult", addNumber);
		*/
		
		
		/* 	Request Dispatcher is used to remote from one page to another i.e servlets
		
			RequestDispatcher rd = req.getRequestDispatcher("sq");
			rd.forward(req, res);
		
		*/
		
		
		/*	Send Redirect is used in passing to servlets but diff bet redirect and 
		   	dispatcher is redirect pass using diff servlet object basically used in
		    ecommerce web checkout where payment we redirect to diff page whereas distpatcher
		    internally pass the first servlet object to rest servlets and last one return to web
		    browser the response this is usually done within same web	 
		*/
		
		/*	passing parameter in get request that is sum of two numbers so that can find square of it
		    All of these are part of Session Management by session, cookies or url rewriting
		*/
//		res.sendRedirect("sq?sumResult="+addNumber);  //option 1 is using URL rewriting 

	/*	HttpSession session = req.getSession();    // Option 2 is by creating the session which can be accessible to all servlets
		session.setAttribute("sumResult", addNumber);
	*/
		
	/*	Cookie: is like a token initially server send to client and thereafter on another visit or req it uses that token to authenticate */	
		
		Cookie cookie = new Cookie("sumResult", addNumber+"");  //option 3 using cookie 
		res.addCookie(cookie);
	
		res.sendRedirect("sq");
		
	}
	
}
