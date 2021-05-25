package com.test.loopsconcept;

public class Ifelse {

	void m1(int x) {

		if (x >= 10) {

			System.out.println("X value is.........." + x);

		} else {

			System.out.println("Condition is false and I am from else");
		}

	}
	
	public Ifelse() {
		// TODO Auto-generated constructor stub
	}
	public Ifelse(int x) {
		// TODO Auto-generated constructor stub
		
		if (x >= 10) {

			System.out.println("X value is.........." + x);

		} else {

			System.out.println("Condition is false and I am from else");
		}
	}

	public static void main(String[] args) {
		Ifelse obj = new Ifelse(10);
		obj.m1(9);

	}

}
