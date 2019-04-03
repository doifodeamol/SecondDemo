package com.app.extremity.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.app.extremity.iservice.ServiceI;
import com.app.extremity.model.Employee;
import com.app.extremity.model.Vehicle;
import com.app.extremity.serviceimpl.ServiceImpl;
import com.app.extremity.utility.HibernateUtil;

public class UpdateVehicleController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Vehicle vehicle = new Vehicle();
		
		vehicle.setVehicleNo(request.getParameter("vehicleno"));
		vehicle.setVehicleType(request.getParameter("vehicletype"));
		vehicle.setVehicleFlag('F');
		
		String empname = request.getParameter("empname");
		
		String hql = "FROM Employee E WHERE E.employeeName ="+empname;
		Query<Employee> query = session.createQuery(hql);
		Employee emp = query.getSingleResult();
		
		vehicle.setEmployee(emp);
		
		ser.updateVehicle(vehicle);
		request.setAttribute("data",ser.getAllVehicle());
		RequestDispatcher rd = request.getRequestDispatcher("vehicle.jsp");
		rd.forward(request, response);
		
		
	}
}
