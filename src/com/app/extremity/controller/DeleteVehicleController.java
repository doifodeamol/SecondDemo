package com.app.extremity.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.extremity.iservice.ServiceI;
import com.app.extremity.serviceimpl.ServiceImpl;

public class DeleteVehicleController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = 2;
		ser.deleteVehicle(id);
		
		
	}
}
