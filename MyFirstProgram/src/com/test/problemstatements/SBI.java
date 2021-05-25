package com.test.problemstatements;

import java.util.Scanner;

public class SBI {

	int age;
	int depositamount;

	void ageGreaterthantwentyfive() {

		if (age > 25 && depositamount == 500000) {

			System.out.println(" Provide Intrest 6.5%");

		}

		else {

			System.out.println("no schems");
		}

	}

	void ageGreaterthan25and60() {

		if (age > 25 && age < 60 && depositamount == 500000) {

			System.out.println(" Provide Intrest 7.5%");

		} else

			System.out.println("no schems");

	}

	void display(Scanner sc) {

		System.out.println(" enter age'");
		int age = sc.nextInt();
		System.out.println("enter deposit amount");
		int depositamount = sc.nextInt();

		switch (age) {
		case 26:
			ageGreaterthantwentyfive();
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {

		SBI obj = new SBI();
		// obj.bankinformation();
		Scanner sc = new Scanner(System.in);
		obj.display(sc);
	}
}
