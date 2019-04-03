package com.app.extremity.model;

public class Register {
	private Login loginId;
	private ClientEnquiry clientId;
	private Address address;
	private Service service;
	public Login getLoginId() {
		return loginId;
	}
	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}
	public ClientEnquiry getClientId() {
		return clientId;
	}
	public void setClientId(ClientEnquiry clientId) {
		this.clientId = clientId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}


}
