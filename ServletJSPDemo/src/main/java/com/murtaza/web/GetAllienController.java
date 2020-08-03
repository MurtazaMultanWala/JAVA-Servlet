package com.murtaza.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.murtaza.web.dao.AllienDAO;
import com.murtaza.web.model.AllienModel;


public class GetAllienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		AllienDAO allienDAO = new AllienDAO();
		
		AllienModel allienModel = allienDAO.getAllienData(id);
		
		req.setAttribute("allienModel", allienModel);
		
		RequestDispatcher rd = req.getRequestDispatcher("showAllienJSP.jsp");
		rd.forward(req, res);
		
	}


}
