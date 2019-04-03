package com.app.extremity.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.extremity.iservice.ServiceI;
import com.app.extremity.model.Service;
import com.app.extremity.model.ServiceCategory;
import com.app.extremity.model.ServiceType;
import com.app.extremity.serviceimpl.ServiceImpl;

public class UpdateServiceController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Service serObj = new Service();
		serObj.setTitle(request.getParameter("title"));
		serObj.setDescription(request.getParameter("description"));

		ServiceType serType = new ServiceType();
		serType.setName(request.getParameter("type"));

		ServiceCategory serCat = new ServiceCategory();
		serCat.setName(request.getParameter("category"));
		serCat.setFixRate(Integer.parseInt((request.getParameter("fixrate"))));
		serCat.setVariableRate(Integer.parseInt((request.getParameter("variablerate"))));

		serType.getServiceCategories().add(serCat);
		serObj.getServiceTypes().add(serType);

		ser.updateService(serObj);
		request.setAttribute("data",ser.getAllService());
		RequestDispatcher rd = request.getRequestDispatcher("service.jsp");
		rd.forward(request, response);
	}
}
