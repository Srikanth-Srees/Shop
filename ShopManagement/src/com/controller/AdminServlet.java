package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter ("name");
		String password = req.getParameter ("password");
				

				Admin a = new Admin();

				BLManager bl new BLManager();

				a = bl.searchByEmailPass(name,password);
				if (a != null)
				{
				
				resp.sendRedirect("AdminPage.jsp");

				}

				else
				{
				resp.sendRedirect ("userLogin.jsp");

				}

			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
