package com.murtaza;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{

//	JSTL -> Java Servlet Pages (JSP) Standard Tag Library
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = "Murtaza";
		
		req.setAttribute("label", name);
		
		RequestDispatcher rd = req.getRequestDispatcher("displayJSP.jsp");
		rd.forward(req, res);
	}
}
