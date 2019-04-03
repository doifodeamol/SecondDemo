package com.app.extremity.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.extremity.iservice.ServiceI;
import com.app.extremity.model.Address;
import com.app.extremity.model.Employee;
import com.app.extremity.serviceimpl.ServiceImpl;

public class UpdateEmployeeController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employee employee = new Employee();
		employee.setEmployeeName(request.getParameter("fullname"));
		employee.setEmployeeEmail(request.getParameter("email"));
		employee.setEmployeeMobileNo(request.getParameter("mobile"));
		employee.setEmployeeAdharNo(request.getParameter("aadhar"));
		employee.setEmployeePanCard(request.getParameter("pan"));
		employee.setEmployeeSalary(request.getParameter("salary"));
		
		Address addr = new Address();
		addr.setFlatNo(request.getParameter("flatno"));
		addr.setArea(request.getParameter("area"));
		addr.setLandMark(request.getParameter("landmark"));
		addr.setCity(request.getParameter("city"));
		addr.setPinCode(Integer.parseInt(request.getParameter("pincode")));
		employee.setEmployeeAddrss(addr);
		
		ser.updateEmployee(employee);
		request.setAttribute("data",ser.getAllEmployee());
		RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
		rd.forward(request, response);
	}
}
