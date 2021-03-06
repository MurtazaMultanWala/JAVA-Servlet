package com.murtaza;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.murtaza.dao.LoginDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		
		LoginDAO loginDAO = new LoginDAO();
		
		if(loginDAO.checkCredentials(username, password)) {
//			creating session to secure pages needed authentication for access
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			
//			redirect to home page
			res.sendRedirect("homeJSP.jsp");
		}
		else
		{
			res.sendRedirect("loginJSP.jsp");
		}
	}
	
}
