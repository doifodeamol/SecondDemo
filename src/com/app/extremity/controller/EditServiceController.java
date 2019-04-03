package com.app.extremity.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.extremity.iservice.ServiceI;
import com.app.extremity.serviceimpl.ServiceImpl;

public class EditServiceController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		request.setAttribute("data", ser.getServiceById(id)); 
		RequestDispatcher rd = request.getRequestDispatcher("editService.jsp");
		rd.forward(request, response);
	}
}
