package com.emp.java;

import java.util.Scanner;

public class Test {

	void m1(String Authorname, int year, String rackno, double price, String Booktitle) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Book title name");
		sc.next();
	

		if (Booktitle.equals(sc)) {

			System.out.println(" Rack number is=============" + rackno);
			
			System.out.println(" Price is=============" + price);
			System.out.println(" Name is=============" + Authorname);
			System.out.println(" Year is=============" + year);

		} else {

			System.out.println(" No book has found");
		}

	}

	public static void main(String[] args) {

		Test obj = new Test();
		obj.m1("David", 1994, "20", 255.41,"Wings of Fire");

	}
}
