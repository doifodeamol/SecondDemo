package com.app.extremity.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.extremity.iservice.ServiceI;
import com.app.extremity.serviceimpl.ServiceImpl;

@WebServlet("/vehicle")
public class VehicleController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ser.addVehicle();
		
		request.setAttribute("data", ser.getAllVehicle());
		
		RequestDispatcher rd = request.getRequestDispatcher("AdminJspPages/vehicle.jsp");
		rd.forward(request, response);
		
		
	}
}
