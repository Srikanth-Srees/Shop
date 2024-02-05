package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter ("email");
		String password = req.getParameter ("password");
				

				Register reg = new Register();

				BLManager bl new BLManager();

				reg = bl.searchByEmailPass(email,password);
				if (reg != null)
				{
				HttpSession Sess = req.getSession(); 
				Sess.setAttribute("em" reg); 
				resp.sendRedirect("welcome.jsp");

				}

				else
				{
				resp.sendRedirect ("userLogin.jsp");

				}

				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
