package com.app.extremity.utility;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.app.extremity.model.Address;
import com.app.extremity.model.Employee;
import com.app.extremity.model.Role;
import com.app.extremity.model.Service;
import com.app.extremity.model.ServiceCategory;
import com.app.extremity.model.ServiceType;
import com.app.extremity.model.Vehicle;

public class HibernateUtil {	
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{
		Map<String,Object> settings=new HashMap<>();
		
		settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/packersandmovers");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		settings.put(Environment.HBM2DDL_AUTO, "update");
		settings.put(Environment.SHOW_SQL, "true");
		if(sf==null)
		{
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(settings).build();
		
		MetadataSources mds=new MetadataSources(registry)
				.addAnnotatedClass(ServiceCategory.class)
				.addAnnotatedClass(ServiceType.class)
				.addAnnotatedClass(Service.class)
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Role.class)
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Vehicle.class);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		sf=md.getSessionFactoryBuilder().build();
		}
		return sf;
		
	}

}
