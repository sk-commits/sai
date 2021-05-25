package com.test.loopsconcept;

public class NestedIf {

	int i = 5;

	void m1() {

		if (i == 10) {
			// First if statement

			System.out.println(" excuted from first if statement" + i);
			if (i < 15)
				System.out.println("i is smaller than 15");

			// Nested - if statement
			// Will only be executed if statement above
			// it is true
			if (i < 12)
				System.out.println("i is smaller than 12 too");
			else
				System.out.println("i is greater than 15");
		}

		System.out.println("i am from outside");
	}

	public static void main(String[] args) {

		NestedIf obj = new NestedIf();

		obj.m1();

	}
}
