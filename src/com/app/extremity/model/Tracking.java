package com.app.extremity.model;

public class Tracking {
	private int trackingId;
	private String trackingStatus;
	private Register registerId;
	public int getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}
	public String getTrackingStatus() {
		return trackingStatus;
	}
	public void setTrackingStatus(String trackingStatus) {
		this.trackingStatus = trackingStatus;
	}
	public Register getRegisterId() {
		return registerId;
	}
	public void setRegisterId(Register registerId) {
		this.registerId = registerId;
	}


}
