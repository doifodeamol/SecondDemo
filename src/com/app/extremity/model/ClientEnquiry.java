package com.app.extremity.model;

import java.sql.Date;

public class ClientEnquiry {
	private int clientId;
	private String clientName;
	private String shiftFrom;
	private String shiftTo;
	private Date date;
	private String clientEmail;
	private String clientMobileNo;
	private String clientStatus;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getShiftFrom() {
		return shiftFrom;
	}
	public void setShiftFrom(String shiftFrom) {
		this.shiftFrom = shiftFrom;
	}
	public String getShiftTo() {
		return shiftTo;
	}
	public void setShiftTo(String shiftTo) {
		this.shiftTo = shiftTo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientMobileNo() {
		return clientMobileNo;
	}
	public void setClientMobileNo(String clientMobileNo) {
		this.clientMobileNo = clientMobileNo;
	}
	public String getClientStatus() {
		return clientStatus;
	}
	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}
}
