package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String name = req.getParameter("name");

		String email= req.getParameter("email");

		String password=req.getParameter("password");

		String phone = req.getParameter("phone");

		byte phon[]= phone.getBytes():

		Register reg =new Register();

		req.setName(name);
		req.setEmail(email);
		req.setPassword(password);
		req.setPhone(phone);
		BLmanager bl= new BLManager():

		bl.saveRegisterInfo(reg):

		response.sendRedirect("UserLogin.jsp"):

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
