package com.murtaza;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAllien")
public class myFilterServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("aname");
		int id = Integer.parseInt(req.getParameter("aid"));
		
		out.println("Welcome " + name);
	}
}
