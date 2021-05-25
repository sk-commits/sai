package com.test.problemstatements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SubClass {

	ArrayList<MainClass> list = new ArrayList<MainClass>();

	ArrayList<MainClass> getCityNamesBasedOnDistrict() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {

			System.out.println(" Enter state name");
			String state = sc.next();

			for (int j = 0; j < 4; j++) {

				System.out.println(" enter district name");
				String district = sc.next();

				MainClass obj = new MainClass(state, district);
				list.add(obj);
				Comparator<MainClass> obj1 = new Comparator<MainClass>() {

					@Override
					public int compare(MainClass o1, MainClass o2) {
						// TODO Auto-generated method stub
						return o1.getDistrict().compareTo(o2.getDistrict());
					}

				};
				Collections.sort(list, obj1);

			}
		}
		return list;
	}

	void display(Scanner sc) {

		getCityNamesBasedOnDistrict();

		System.out.println("enter state name");
		String state = sc.next();
		for (MainClass mainClass : list) {
			if (mainClass.getState().equalsIgnoreCase(state)) {

				System.out.println("District name are ...." + mainClass.getDistrict());

			}

			else {
				System.out.println("invalid state name");
				break;

			}
		}

	}

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		Scanner sc = new Scanner(System.in);
		obj.display(sc);

	}
}
