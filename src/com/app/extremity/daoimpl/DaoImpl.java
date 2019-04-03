package com.app.extremity.daoimpl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.extremity.idao.DaoI;
import com.app.extremity.model.Address;
import com.app.extremity.model.Employee;
import com.app.extremity.model.Role;
import com.app.extremity.model.Service;
import com.app.extremity.model.ServiceCategory;
import com.app.extremity.model.ServiceType;
import com.app.extremity.model.Vehicle;
import com.app.extremity.utility.HibernateUtil;

public class DaoImpl implements DaoI {

 public static Session session;
/*---------------------------------------------------------------Service-----------------------------------------------------------*/
	@Override
	public void addService() {

		session = HibernateUtil.getSessionFactory().openSession();
		Service service = new Service();
		service.setTitle("Packing & Shifting");
		service.setDescription("Shifting Ur Lagage");
		ServiceType st = new ServiceType();
		st.setName("Home");
		ServiceType st1 = new ServiceType();
		st1.setName("Commercial");
		ServiceCategory sc = new ServiceCategory();
		sc.setName("1BHK");
		sc.setFixRate(50000);
		sc.setVariableRate(1250);
		ServiceCategory scc = new ServiceCategory();
		scc.setName("2BHK");
		scc.setFixRate(60000);
		scc.setVariableRate(2500);
		ServiceCategory sccc = new ServiceCategory();
		sccc.setName("Office");
		sccc.setFixRate(80000);
		sccc.setVariableRate(4500);
		st.getServiceCategories().add(sc);
		st.getServiceCategories().add(scc);
		st1.getServiceCategories().add(sccc);
		service.getServiceTypes().add(st);
		service.getServiceTypes().add(st1);

		session.save(service);
		session.beginTransaction().commit();
	}

	@Override
	public List<Service> getAllService() {
		session = HibernateUtil.getSessionFactory().openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Service> query = builder.createQuery(Service.class);
		Root<Service> root = query.from(Service.class);
		query.select(root);
		Query<Service> q = session.createQuery(query);
		List<Service> serviceList = q.getResultList();
		session.beginTransaction().commit();

		for (Service ser : serviceList) {
			System.out.println(ser.getId());
			System.out.println(ser.getTitle());
			System.out.println(ser.getDescription());
			for (ServiceType stp : ser.getServiceTypes()) {
				System.out.println(stp.getId());
				System.out.println(stp.getName());
				for (ServiceCategory scs : stp.getServiceCategories()) {
					System.out.println(scs.getId());
					System.out.println(scs.getName());
					System.out.println(scs.getFixRate());
					System.out.println(scs.getVariableRate());
				}
			}
		}

		return serviceList;
	}

	@Override
	public void deleteService(int id) {
		session = HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder  builder=session.getCriteriaBuilder();
		Transaction tx = session.beginTransaction();
		CriteriaDelete<Service> delet=builder.createCriteriaDelete(Service.class);
		Root<Service> root =delet.from(Service.class);
		delet.where(builder.equal(root.get("id"),id));
		session.createQuery(delet).executeUpdate();
		tx.commit();
	}
	
	@Override
	public Service getServiceById(int id) {
		 CriteriaBuilder builder = session.getCriteriaBuilder();
		 CriteriaQuery<Service> query = builder.createQuery(Service.class);
		 Root<Service> root = query.from(Service.class);
		 query.select(root).where(builder.equal(root.get("id"),id));
		 Query<Service> q = session.createQuery(query);
		 Service ser = q.getSingleResult();
		 return ser;
	}
	
	@Override
	public void updateService(Service serObj) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(serObj);
		tx.commit();
	}
	/*------------------------------------------------------------Employee------------------------------------------------------------------------------*/
	public void addEmployee() {

		session = HibernateUtil.getSessionFactory().openSession();

		Employee employee = new Employee();
		employee.setEmployeeName("Amol Doifode");
		employee.setEmployeeMobileNo("9021421981");
		employee.setEmployeeEmail("doifodeamol@gmail.com");
		employee.setEmployeeAdharNo("787878787878");
		employee.setEmployeePanCard("ASDFK7896L");
		employee.setEmployeeSalary("50000");
		employee.setEmployeeFlag('F');

		Role role = new Role();
		role.setRoleName("Admin");
		employee.setEmployeeRole(role);

		Address addr1 = new Address();
		addr1.setFlatNo("123");
		addr1.setArea("KarveNagar");
		addr1.setLandMark("Manase Square");
		addr1.setCity("Pune");
		addr1.setPinCode(411052);

		employee.setEmployeeAddrss(addr1);

		session.save(employee);
		session.beginTransaction().commit();

	}

	public List<Employee> getAllEmployee() {

		session = HibernateUtil.getSessionFactory().openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		Query<Employee> q = session.createQuery(query);
		List<Employee> employeeList = q.getResultList();
		session.beginTransaction().commit();

		for (Employee emp : employeeList) {
			System.out.println(emp.getEmployeeId());
			System.out.println(emp.getEmployeeName());
			System.out.println(emp.getEmployeeAdharNo());
			System.out.println(emp.getEmployeePanCard());
			System.out.println(emp.getEmployeeRole().getRoleName());
			System.out.println(emp.getEmployeeEmail());
			System.out.println(emp.getEmployeeMobileNo());
			System.out.println(emp.getEmployeeDateOfJoining());
			System.out.println(emp.getEmployeeSalary());
			System.out.println(emp.getEmployeeFlag());

			System.out.print("Address :-"+emp.getEmployeeAddrss().getFlatNo());
			System.out.print(emp.getEmployeeAddrss().getArea());
			System.out.println(emp.getEmployeeAddrss().getLandMark());
			System.out.print(emp.getEmployeeAddrss().getCity());
			System.out.print(emp.getEmployeeAddrss().getPinCode());
		}

		return employeeList;
	}
	
	@Override
	public void deleteEmployee(int id) {
		session = HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder  builder=session.getCriteriaBuilder();
		Transaction tx = session.beginTransaction();
		CriteriaDelete<Employee> delet=builder.createCriteriaDelete(Employee.class);
		Root<Employee> root =delet.from(Employee.class);
		delet.where(builder.equal(root.get("employeeId"),id));
		session.createQuery(delet).executeUpdate();
		tx.commit();
	}

	@Override
	public Employee getEmployeeById(int id) {
		 CriteriaBuilder builder = session.getCriteriaBuilder();
		 CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		 Root<Employee> root = query.from(Employee.class);
		 query.select(root).where(builder.equal(root.get("employeeId"),id));
		 Query<Employee> q = session.createQuery(query);
		 Employee emp = q.getSingleResult();
		 return emp;
	}

	@Override
	public void updateEmployee(Employee employee) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(employee);
		tx.commit();	
	}
	
/*------------------------------------------------------------------------Vehicle--------------------------------------------------------------*/
	@Override
	public void addVehicle() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleNo("MH-12 CJ-5425");
		vehicle.setVehicleType("Truck");

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(builder.equal(root.get("employeeRole"), 3),
				builder.equal(root.get("employeeFlag"), 'F'));
		Query<Employee> q = session.createQuery(query);
		Employee employee = q.getSingleResult();
		session.beginTransaction().commit();

		vehicle.setEmployee(employee);
		vehicle.setVehicleFlag('F');

		session.save(vehicle);
		session.beginTransaction().commit();
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		session = HibernateUtil.getSessionFactory().openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Vehicle> query = builder.createQuery(Vehicle.class);
		Root<Vehicle> root = query.from(Vehicle.class);
		query.select(root);
		Query<Vehicle> q = session.createQuery(query);
		List<Vehicle> vehicleList = q.getResultList();
		session.beginTransaction().commit();

		return vehicleList;
	}

	@Override
	public void deleteVehicle(int id) {
		session = HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder  builder=session.getCriteriaBuilder();
		Transaction tx = session.beginTransaction();
		CriteriaDelete<Vehicle> delet=builder.createCriteriaDelete(Vehicle.class);
		Root<Vehicle> root =delet.from(Vehicle.class);
		delet.where(builder.equal(root.get("vehicleId"),id));
		session.createQuery(delet).executeUpdate();
		tx.commit();
	}

	@Override
	public Vehicle getVehicleById(int id) {
		 CriteriaBuilder builder = session.getCriteriaBuilder();
		 CriteriaQuery<Vehicle> query = builder.createQuery(Vehicle.class);
		 Root<Vehicle> root = query.from(Vehicle.class);
		 query.select(root).where(builder.equal(root.get("vehicleId"),id));
		 Query<Vehicle> q = session.createQuery(query);
		 Vehicle veh = q.getSingleResult();
		 return veh;
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(vehicle);
		tx.commit();
	}
}
