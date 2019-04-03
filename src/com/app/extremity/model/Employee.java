package com.app.extremity.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private String employeeMobileNo;
	private String employeeEmail;
	private String employeeAdharNo;
	private String employeePanCard;

	@CreationTimestamp
	private Date employeeDateOfJoining;

	private String employeeSalary;

	@OneToOne(cascade = CascadeType.ALL)
	private Role employeeRole;

	@OneToOne(cascade = CascadeType.ALL)
	private Address employeeAddrss;

	private char employeeFlag;

	public char getEmployeeFlag() {
		return employeeFlag;
	}

	public void setEmployeeFlag(char employeeFlag) {
		this.employeeFlag = employeeFlag;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMobileNo() {
		return employeeMobileNo;
	}

	public void setEmployeeMobileNo(String employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeAdharNo() {
		return employeeAdharNo;
	}

	public void setEmployeeAdharNo(String employeeAdharNo) {
		this.employeeAdharNo = employeeAdharNo;
	}

	public String getEmployeePanCard() {
		return employeePanCard;
	}

	public void setEmployeePanCard(String employeePanCard) {
		this.employeePanCard = employeePanCard;
	}

	public Date getEmployeeDateOfJoining() {
		return employeeDateOfJoining;
	}

	public void setEmployeeDateOfJoining(Date employeeDateOfJoining) {
		this.employeeDateOfJoining = employeeDateOfJoining;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Role getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(Role employeeRole) {
		this.employeeRole = employeeRole;
	}

	public Address getEmployeeAddrss() {
		return employeeAddrss;
	}

	public void setEmployeeAddrss(Address employeeAddrss) {
		this.employeeAddrss = employeeAddrss;
	}
}
