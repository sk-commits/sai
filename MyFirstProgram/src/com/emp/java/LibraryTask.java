package com.emp.java;

import java.util.Scanner;

public class LibraryTask {

	String rackno;
	double price;
	String Name;
	int year;

	public void m1(String rackno, double price, String Name, int year) {

		try {
			for (int i = 0; i < 5; i++) {

				LibraryTask obj = new LibraryTask();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Booktitle name");
				String Booktitle = sc.nextLine();

				if (Booktitle.equals("wings of fire")) {

					System.out.println(" Rack number is=============" + rackno);
					System.out.println(" Price is=============" + price);
					System.out.println(" Name is=============" + Name);
					System.out.println(" Year is=============" + year);

				} else {

					System.out.println("Book Not available");

				}

			}
		} catch (Exception e) {
			// TODO: handle exception

			e.getMessage();

			System.out.println("I am from after else" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		LibraryTask obj = new LibraryTask();
		obj.m1("20", 55.23, "David", 1994);

	}

}
