package com.test.problemstatements;

public class Property implements Comparable<Property> {

	String typeofPropety;
	double priceOfProperty;
	double sqyards;
	String location;

	public Property(String typeofPropety, double priceOfProperty, double sqyards, String location) {

		this.typeofPropety = typeofPropety;
		this.priceOfProperty = priceOfProperty;
		this.sqyards = sqyards;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Property [typeofPropety=" + typeofPropety + ", priceOfProperty=" + priceOfProperty + ", sqyards="
				+ sqyards + ", location=" + location + "]";
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

	public void setPriceOfProperty(double priceOfProperty) {
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

	public static void main(String[] args) {

	}

	@Override
	public int compareTo(Property o) {
		// TODO Auto-generated method stub
		
		if (getPriceOfProperty()>o.getPriceOfProperty()) {
			return -1;
		
			
		}

		return 0;
	}

}
