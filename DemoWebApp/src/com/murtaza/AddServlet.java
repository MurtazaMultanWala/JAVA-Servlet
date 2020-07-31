package com.murtaza;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		int addNumber = firstNumber + secondNumber;
		
//		System.out.println("Result is: "+ addNumber); //for console
		PrintWriter out = res.getWriter();
		out.println("Result is: "+ addNumber);
	}
	
}
