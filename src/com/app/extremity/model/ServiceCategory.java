package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int fixRate;
	private int variableRate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFixRate() {
		return fixRate;
	}
	public void setFixRate(int fixRate) {
		this.fixRate = fixRate;
	}
	public int getVariableRate() {
		return variableRate;
	}
	public void setVariableRate(int variableRate) {
		this.variableRate = variableRate;
	}
}
