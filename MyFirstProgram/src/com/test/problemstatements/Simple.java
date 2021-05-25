package com.test.problemstatements;

import java.util.Comparator;

public class Simple implements Comparator<Simple>{
	String typeofPropety;
	int priceOfProperty;
	double sqyards;
	String location;

	public Simple(String typeofPropety, int priceOfProperty, double sqyards, String location) {
		super();
		this.typeofPropety = typeofPropety;
		this.priceOfProperty = priceOfProperty;
		this.sqyards = sqyards;
		this.location = location;
	}

	public String getTypeofPropety() {
		return typeofPropety;
	}

	public void setTypeofPropety(String typeofPropety) {
		this.typeofPropety = typeofPropety;
	}

	public double getPriceOfProperty() {
		return priceOfProperty;
	}

	public void setPriceOfProperty(int priceOfProperty) {
		this.priceOfProperty = priceOfProperty;
	}

	public double getSqyards() {
		return sqyards;
	}

	public void setSqyards(double sqyards) {
		this.sqyards = sqyards;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Simple [typeofPropety=" + typeofPropety + ", priceOfProperty=" + priceOfProperty + ", sqyards="
				+ sqyards + ", location=" + location + "]";
	}

	@Override
	public int compare(Simple o1, Simple o2) {
		// TODO Auto-generated method stub
		//return o1.typeofPropety.compareTo(o2.typeofPropety);
		return o1.priceOfProperty-o2.priceOfProperty;
	}


	}



