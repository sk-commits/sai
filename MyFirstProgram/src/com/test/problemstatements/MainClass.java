package com.test.problemstatements;


public class MainClass  {
	
    String State;
	String district;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public MainClass(String state, String district) {
		super();
		State = state;
		this.district = district;
	}
	
	}