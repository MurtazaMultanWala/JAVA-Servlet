package com.murtaza;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 
		 PrintWriter out = res.getWriter();
		 out.print("Hi ");
		 
		/*
			 Servlet Context is used to share initial values in beginning of the application like username or pass
			 which are used fit initially. and it is shared amongst "ALL" the servlets.
		*/
		 
		ServletContext ctx = getServletContext();
		String strServletContext =  ctx.getInitParameter("Phone");
		out.println(strServletContext);
		
		
		/*
			 Servlet Config is same like context but here it is not shared amongst "ALL" the servlets. it is set inside
			 specific servlet.
		*/
		
		ServletConfig cg = getServletConfig();
		String strServletConfig = cg.getInitParameter("name");
		out.println(strServletConfig);
		
		
	 }
}
