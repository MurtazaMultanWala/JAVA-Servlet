package com.murtaza;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		/* 	Request Dispatcher Implementation
		 
		 	int sumResult = (int) req.getAttribute("sumResult");		
			int squareResult = sumResult * sumResult;
			
			PrintWriter out = res.getWriter();	
			out.println("Result is: "+ sumResult);
			out.println("Square is " + squareResult);
		*/
			
			
		/*	send Redirect Implementation */ 
			
/*		option 1 using URL Rewriting
		int sumResult = Integer.parseInt(req.getParameter("sumResult"));
*/		
		

/*		Option 2 using Session Management
		HttpSession session = req.getSession();
		int sumResult = (int) session.getAttribute("sumResult");
*/
		
/*		
 		Option 3 using Cookie
*/
		Cookie cookies[] = req.getCookies();
		
		int sumResult=0;
		
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("sumResult")) {
				
				sumResult= Integer.parseInt(cookie.getValue());
			}
		}
		 	
		int squareResult = sumResult * sumResult;
		
		PrintWriter out = res.getWriter();	
		out.println("Sum is: "+ sumResult);
		out.println("Square is " + squareResult);
	}

}
