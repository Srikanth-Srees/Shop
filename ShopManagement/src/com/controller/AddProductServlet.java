package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		
		String productName=req.getParameter("ProductName");
		String price=req.getParameter("price");
		String paymode=req.getParameter("paymode");
		String Availability=req.getParameter("Availability");
	
		BLManager b1= new BLmanager();
		AddProduct ap = new AddProduct();
		ap.setProductName(productName);
		ap.setPrice(price);
		ap.setPaymode(paymode);
		ap.setAvailability(Availability);
		
		response.sendRedirect("AddProduct.jsp");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
