package com.test.problemstatements;

import java.util.ArrayList;
import java.util.Collections;

public class PropertyDetails {

	ArrayList<Property> list = new ArrayList<Property>();

	ArrayList<Property> getPropertyDetails() {

		list.add(new Property("Duplex", 300000, 7000, "KPHB"));
		list.add(new Property("Individual", 74196, 2560, "HYD"));
		list.add(new Property("Apartment", 77899, 1100, "KNR"));
		list.add(new Property("Villa", 300000, 4000, "AMEERPET"));
		list.add(new Property("GuestHouse", 300000, 5000, "WGL"));
		Collections.sort(list);

		for (Property property : list) {

			//System.out.println("square yards........" + property.getSqyards() +"priceOfProperty........" + property.getPriceOfProperty() + "location......." + property.getLocation() + "typeofPropety.........." + property.getTypeofPropety());
			
			System.out.println(property);

		}

		
		
		return list;
	}

	public static void main(String[] args) {

		PropertyDetails obj = new PropertyDetails();
		obj.getPropertyDetails();

	}

}
