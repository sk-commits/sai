package com.test.problemstatements;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import java.util.Scanner;

public class SimpleTest {

	ArrayList<Simple> list = new ArrayList<Simple>();

	//@SuppressWarnings("unchecked")
	ArrayList<Simple> getSimpleDetails() {

		list.add(new Simple("Duplex", 300000, 7000, "KPHB"));
		list.add(new Simple("Individual", 74196, 2560, "HYD"));
		list.add(new Simple("Apartment", 77899, 1100, "KNR"));
		list.add(new Simple("Villa", 300000, 4000, "AMEERPET"));
		list.add(new Simple("GuestHouse", 300000, 5000, "WGL"));

		return list;
	}

	void display(Scanner sc) {
		getSimpleDetails();
		
		System.out.println("enter property price");
		int price = sc.nextInt();
		for (Simple simple : list) {
			if ( simple.getPriceOfProperty() == price) {

				System.out.println("price of the property is ..........." + simple.getPriceOfProperty() + "location of the property is......"+simple.getLocation());

			
			}

		}

	}

	public static void main(String[] args) {
		SimpleTest obj = new SimpleTest();
		Scanner sc = new Scanner(System.in);
		// obj.getSimpleDetails();
		obj.display(sc);
	}

}
