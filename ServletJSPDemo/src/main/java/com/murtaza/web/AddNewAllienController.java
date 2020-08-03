package com.murtaza.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.murtaza.web.dao.AllienDAO;
import com.murtaza.web.model.AllienModel;

public class AddNewAllienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		AllienModel allienModel = new AllienModel();
		PrintWriter out = res.getWriter();
		
		if(req.getParameter("id").length()>0 && req.getParameter("name").length()>0 && req.getParameter("tech").length()>0) {
			
			allienModel.setId(Integer.parseInt( req.getParameter("id")));
			allienModel.setName(req.getParameter("name"));
			allienModel.setTech(req.getParameter("tech"));
			
			AllienDAO allienDAO = new AllienDAO();
			
			allienDAO.addAllienData(allienModel);
		}
		else
			res.sendRedirect("NewAllienFormJSP.jsp");
	}
}


