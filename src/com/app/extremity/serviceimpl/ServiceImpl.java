package com.app.extremity.serviceimpl;

import java.util.List;

import com.app.extremity.daoimpl.DaoImpl;
import com.app.extremity.idao.DaoI;
import com.app.extremity.iservice.ServiceI;
import com.app.extremity.model.Employee;
import com.app.extremity.model.Service;
import com.app.extremity.model.Vehicle;

public class ServiceImpl implements ServiceI {
   
	DaoI dao = new DaoImpl();
	
	@Override
	public void addService() {
		dao.addService();	
	}
	@Override
	public List<Service> getAllService() {
		return dao.getAllService();
	}
	@Override
	public void addEmployee() {
		dao.addEmployee();
		
	}
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployee();
	}
	@Override
	public void addVehicle() {
		dao.addVehicle();
	}
	@Override
	public List<Vehicle> getAllVehicle() {
		return dao.getAllVehicle();
	}
	@Override
	public void deleteService(int id) {
		dao.deleteService(id);
	}
	@Override
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}
	@Override
	public void deleteVehicle(int id) {
		dao.deleteVehicle(id);
	}
	@Override
	public Service getServiceById(int id) {
		
		return dao.getServiceById(id);
	}
	@Override
	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}
	@Override
	public Vehicle getVehicleById(int id) {
		return dao.getVehicleById(id);
	}
	@Override
	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}
	@Override
	public void updateService(Service serObj) {
		dao.updateService(serObj);
		
	}
	@Override
	public void updateVehicle(Vehicle vehicle) {
		dao.updateVehicle(vehicle);
	}
}
