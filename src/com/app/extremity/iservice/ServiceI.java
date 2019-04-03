package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.Employee;
import com.app.extremity.model.Service;
import com.app.extremity.model.Vehicle;

public interface ServiceI {

	public void addService();
	
	public List<Service> getAllService();
	
	public void addEmployee();
	
	public List<Employee> getAllEmployee();

	public void addVehicle();

	public List<Vehicle> getAllVehicle();

	public void deleteService(int id);

	public void deleteEmployee(int id);

	public void deleteVehicle(int id);

	public Service getServiceById(int id);

	public Employee getEmployeeById(int id);

	public Vehicle getVehicleById(int id);

	public void updateEmployee(Employee employee);

	public void updateService(Service serObj);

	public void updateVehicle(Vehicle vehicle);
	
	
}


