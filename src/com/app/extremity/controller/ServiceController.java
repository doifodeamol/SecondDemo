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
import com.google.gson.Gson;
@WebServlet("/AdminJspPages/service")
public class ServiceController extends HttpServlet {

	ServiceI ser = new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println(request.getParameter("title"));
			System.out.println(request.getParameter("description"));
			for(int j=1;j<=Integer.parseInt(request.getParameter("couType"));j++) {
			System.out.println(request.getParameter("type"+j));
			}
			for(int i=1;i<=Integer.parseInt(request.getParameter("catCount"));i++)
			{
				System.out.println(request.getParameter("cat"+i));
				System.out.println(request.getParameter("fix"+i));
				System.out.println(request.getParameter("vari"+i));
			}
		   // Map<String, String>  Temp   =  request.getParameterMap();
			
			//System.out.println(Temp);
			//ser.addService();
			
			request.setAttribute("data", ser.getAllService());
			String statejson=new Gson().toJson(ser.getAllService());
			System.out.println(statejson);
			RequestDispatcher rd = request.getRequestDispatcher("AdminJspPages/service.jsp");
			rd.forward(request, response);
	}
}
